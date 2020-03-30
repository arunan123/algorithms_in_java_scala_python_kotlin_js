def test(inp, value):
    return binary_search(inp, 0, len(inp), value)


def binary_search(inp, lo, hi, val_to_find):

    if hi <= lo:
        return -1

    mid = lo + (hi-lo)//2
    if val_to_find < inp[mid]:
        return binary_search(inp, lo, mid-1, val_to_find)
    elif val_to_find > inp[mid]:
        return binary_search(inp, mid+1, hi, val_to_find)
    elif val_to_find == inp[mid]:
        return inp[mid]
    else:
        return -1


args = [1, 5, 6, 9, 10, 15, 19, 20, 24]
print(test(args, 15))
print(test(args, 16))
