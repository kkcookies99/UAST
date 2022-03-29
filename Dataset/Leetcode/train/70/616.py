class Solution:
    def XXX(self, n: int) -> int:
        if n==0 or n==1: return 1
        memory = [1,1] #记录到第k步有多少种走法
        for i in range(1,n):
            memory.append(memory[i]+memory[i-1])
        return memory[-1]

