o_k, o_q, o_l, o_v, o_n, o_p = 1, 1, 2, 2, 2, 8
k, q, l, v, n, p = map(int, input().split())
s_k, s_q, s_l, s_v, s_n, s_p = (o_k - k), (o_q - q), (o_l - l), (o_v - v), (o_n - n), (o_p - p)
print(s_k, s_q, s_l, s_v, s_n, s_p)