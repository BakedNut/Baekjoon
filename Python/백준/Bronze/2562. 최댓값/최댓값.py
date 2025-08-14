num = []
k = 1
while k < 10:
    a = int(input())
    num.append(a)
    k += 1
m = max(num)
sol = 0
for i in num:
    sol += 1
    if i == m:
        break
print(num[sol - 1])
print(sol)
