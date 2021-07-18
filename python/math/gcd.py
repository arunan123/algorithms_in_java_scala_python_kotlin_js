def gcd(p, q):
    """Implementation of Euclid's Algorithm to find GCD between 2 numbers"""
    if q == 0:
        return p
    return gcd(q, p % q)


def lcm(p, q):
    return (p * q)//gcd(p, q)


print(gcd(10, 5))
print(lcm(4, 6))