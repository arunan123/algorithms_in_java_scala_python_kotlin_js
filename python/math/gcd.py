def gcd(p, q):
    """Implementation of Euclid's Algorithm to find GCD between 2 numbers"""
    if q == 0:
        return p
    return gcd(q, p % q)


print(gcd(10, 5))