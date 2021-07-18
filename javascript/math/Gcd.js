class Gcd {
    gcd(p, q) {
        if (q === 0) return p;
        return this.gcd(q, p % q);
    }

    lcm(p, q) {
        return (p * q)/this.gcd(p, q);
    }
}

console.log(new Gcd().gcd(5,10));
console.log(new Gcd().lcm(4,6));