def fact(n):
    """Finding factorial iteratively"""
    if n == 1 or n == 0:
        return 1
    result = 1
    for i in range(n, 1, -1):
        result = result * i
    return result


def fact_recur(n):
    """Finding factorial recursively"""
    if n == 1:
        return 1
    return n * fact_recur(n-1)


def count_trailing_zeros(n):
    result = fact(n)
    count = 0
    while result % 10 == 0:
        count = count + 1
        result = result//10
    return count


print(fact(5))
print(fact(100))
print(fact_recur(5))
print(fact_recur(100))
print(count_trailing_zeros(10))
print(count_trailing_zeros(100))