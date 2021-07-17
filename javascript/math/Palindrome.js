class Palindrome {
    isPalindrome(value) {
        var temp = value;
        var rev = 0;
        while (temp != 0) {
            var lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = Math.floor(temp / 10);
        }
        return rev == value;
    }
}

console.log(new Palindrome().isPalindrome(1221));
console.log(new Palindrome().isPalindrome(1234));
console.log(new Palindrome().isPalindrome(12321));

