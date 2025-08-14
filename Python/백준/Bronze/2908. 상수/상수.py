a, b = map(str, input().split())
a, b = ''.join(reversed(a)), ''.join(reversed(b))
a, b = int(a), int(b)
if a > b:
    print(a)
elif a < b:
    print(b)
