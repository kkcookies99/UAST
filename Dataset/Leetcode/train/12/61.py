 class Solution:
    def XXX(self, num: int) -> str:
       romannum = ''
        basenum = 'IVXLCDM'
        i = 1
        while num > 0:
            n = num%10
            if n < 4:
                romannum = basenum[i - 1]*n + romannum
            elif n == 4:
                romannum = basenum[i - 1:i + 1] + romannum
            elif n == 5:
                romannum = basenum[i] + romannum
            elif n < 9:
                romannum = basenum[i] + basenum[i - 1]*(n - 5) + romannum
            else:
                romannum = basenum[i - 1] + basenum[i + 1] + romannum
            i = i + 2
            num = num//10
        return romannum
