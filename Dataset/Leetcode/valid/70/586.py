class Solution:
    def XXX(self, n: int) -> int:
        memo = {0:0, 1:1,2:2} 
        #注意！ 第二阶梯的时候有两种方法， 也写在base case 里！！
        def dp(n):
            if n in memo:return memo.get(n, 0)
            if n == 0 or n == 1 or n==2 :return n
            #到达n 层，是n-1 种方法 和n-2 种方法的和
            #不是1步踏上就2两步登上楼梯
            memo[n] = dp(n-1)+ dp(n-2) 
            
            return memo[n]

        return dp(n)


