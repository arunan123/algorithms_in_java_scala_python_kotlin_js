class Gcd {
    gcd(p, q) {
        if (q === 0) return p;
        return this.gcd(q, p % q);
    }
}

console.log(new Gcd().gcd(5,10));