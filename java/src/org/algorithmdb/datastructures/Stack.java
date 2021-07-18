package org.algorithmdb.datastructures;

import java.util.Iterator;

/**
 * Copyright [2017] [Arunan R]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * -------------------------------------------
 * Stack implmentation using resizable array.
 * -------------------------------------------
 *
 * @author Arunan Ramanathan
 * @date   May 30 2017
 */
public class Stack<T>
implements Iterable<T> {

    T[] stack;
    int head = 0;

    public Stack(int initialSize) {
        stack = (T[]) new Object[initialSize];
    }

    public void push(T value) {
        if (stack.length == head) {
            resizeArray();
        }
        stack[head] = value;
        head++;
    }

    public T pop() throws Exception {
        if (head == 0) {
            throw new Exception("Stack underflow");
        }
        head--;
        T poppedElement = stack[head];
        stack[head] = null;
        return poppedElement;
    }

    public int size() {
        int size = 0;
        for (int i=0; i<stack.length; i++) {
            if (stack[i] != null) size++;
            if (stack[i] == null) break;
        }
        return size;
    }

    public void printStack() {
        for (int i=0; i<stack.length; i++) {
            if (stack[i] != null) {
                System.out.print(stack[i]);
                System.out.print(" => ");
            } else {
                break;
            }
        }
    }
    private void resizeArray() {
        //Doubling strategy is used to resize the array
        int newSize = stack.length * 2;
        T[] newStack = (T[]) new Object[newSize];
        for (int i=0; i<stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator<T>
    implements Iterator<T> {

        int i = 0;
        @Override
        public boolean hasNext() {
            if(stack[i] != null) return true;
            else return false;
        }

        @Override
        public T next() {
            return (T) stack[i++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
