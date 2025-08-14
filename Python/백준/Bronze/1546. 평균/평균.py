N = int(input())
score = list(map(int, input().split()))
M = max(score)
total = 0
for i in score:
    avg = i / M * 100
    total = total + avg
print(total / N)