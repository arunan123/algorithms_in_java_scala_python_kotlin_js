class Factorial {
    //Iterative Factorial
    fact(n) {
        let result = 1;
        for (let i=n; i>=1; i--) {
            result = result * i;
        }
        return result;
    }

    //Recursive Factorial
    factRecursive(n) {
        if (n === 1) {
            return 1;
        }
        return n * this.factRecursive(n-1);
    }
}

console.log(new Factorial().fact(5));
console.log(new Factorial().factRecursive(5));