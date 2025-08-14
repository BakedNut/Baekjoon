A = int(input())
B = int(input())
C = int(input())
ABC = A * B * C
ABC_list = list(map(int, str(ABC)))
num = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
for i in num:
    print(ABC_list.count(i))
