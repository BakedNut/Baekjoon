a = int(input())
for _ in range(a):
    r, s = input().split()
    s, r = list(s), int(r)
    num = 0
    for i in s:
        print(s[num] * r, end = '')
        num += 1
    print('')
