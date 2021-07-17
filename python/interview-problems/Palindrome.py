def is_palindrome(value):
    """Returns true if the input number is palindrome otherwise false"""
    temp = value
    reverse = 0
    while temp != 0:
        last_digit = temp % 10
        reverse = reverse * 10 + last_digit
        temp = temp // 10
    return value == reverse


print("Check if 1221 is palindrome : ", is_palindrome(1221))
print("Check if 12321 is palindrome : ", is_palindrome(12321))
print("Check if 12 is palindrome : ", is_palindrome(12))
print("Check if 221 is palindrome : ", is_palindrome(221))