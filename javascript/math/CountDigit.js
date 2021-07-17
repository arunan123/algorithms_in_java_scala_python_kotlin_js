class CountDigit {
    countDigit(number) {
        var count = 0;
        while (number != 0) {
            count++;
            number = Math.floor(number / 10);
        }
        return count;
    }
}

console.log(new CountDigit().countDigit(1223));
console.log(new CountDigit().countDigit(122354));
console.log(new CountDigit().countDigit(1));