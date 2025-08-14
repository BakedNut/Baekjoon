strlist = list(input())
new_strlist = []
alp = list('abcdefghijklmnopqrstuvwxyz')
num = list('00000000000000000000000000')

for i in strlist:
    if i not in new_strlist:
        new_strlist.append(i)
    else:
        new_strlist.append(1)

for i in range(len(new_strlist)):
    for k in range(26):
        if new_strlist[i] == alp[k]:
            num[k] = i
for i in range(len(num)):
    if num[i] == '0':
        num[i] = -1

for i in range(len(num)):
    print(num[i], end = ' ')
