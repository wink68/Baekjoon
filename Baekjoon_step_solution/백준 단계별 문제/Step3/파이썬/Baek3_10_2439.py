# 백준 2439번(step3-10): 별찍기
# Python

n = int(input())

for i in range(n):
    print(" " * (n-i-1) + '*' * (i+1))