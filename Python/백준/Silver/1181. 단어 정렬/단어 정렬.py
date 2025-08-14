from sys import stdin

num = int(stdin.readline())
l = list(set([stdin.readline().strip() for _ in range(num)]))
l.sort()
l.sort(key=lambda x: len(x))

for i in l:
    print(i)
