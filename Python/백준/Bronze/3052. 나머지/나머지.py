li = []
for i in range(0, 10):
    a = int(input())
    li.append(a)
li_na = []
for i in range(0, 10):
    b = li[i] % 42
    li_na.append(b)
li_na = set(li_na)
li_na = list(li_na)
print(len(li_na))