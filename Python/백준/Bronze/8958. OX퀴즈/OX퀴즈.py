repeat = int(input())
for _ in range(repeat):
    OX = list(input())
    r = 0
    sequence = 1
    for i in range(len(OX)):
        if OX[i] == 'O':
            r += sequence
            sequence += 1
        elif OX[i] == 'X':
            sequence = 1
    print(r)
