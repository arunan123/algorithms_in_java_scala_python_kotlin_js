def prime(value):
    half = value//2
    for i in range(2, half+1):
        if value % i == 0:
            return False
    return True


print(prime(13))
print(prime(12))