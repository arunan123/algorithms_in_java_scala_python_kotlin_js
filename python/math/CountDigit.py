def count_digit(value):
    """Count the number of digits in the number passed into this function"""
    digit_counter = 0
    while value > 0:
        digit_counter = digit_counter + 1
        value = value // 10
    return digit_counter


print("Length of the number 1111 = ", count_digit(1111))