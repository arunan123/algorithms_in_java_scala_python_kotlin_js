package org.algorithmdb.datastructures.list;

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
 * ---------------------------------------------------------------------
 * List interface, should be extended by all List abstract datastructure 
 * implementations. Less methods to keep it simple and efficient than 
 * Java implementation.
 * ---------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date   March 17 2013
 */

public interface List<T> {
	void add(T element);
	void remove(int index);
	void removeFirst();
	void removeLast();
	int size();
}
