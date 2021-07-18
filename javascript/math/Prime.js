class Prime {
    isPrime(value) {
        let half = value/2;
        for (let i=2; i<=half; i++) {
            if(value % i === 0) {
                return false;
            }
        }
        return true;
    }
}

console.log(new Prime().isPrime(12));
console.log(new Prime().isPrime(13));