 class Solution:
    """
    first time:53min
    total time:53min
    time complexity:O(max(m,n))
    space complexity:O(1)
    idea:将长度短的字符串补零。
    """
    def XXX(self, a: str, b: str) -> str:
        x,y=-1,-1
        j=0  #进位
        c=""
        m,n=len(a),len(b)
        if m>=n:
            b="0"*max(m-n,n-m)+b
        else:
            a="0"*max(m-n,n-m)+a
        while x>=-max(m,n):
            newChar=str(int(a[x])+int(b[y]))
            if newChar=="0":
                if j==0:
                    c="0"+c
                else:
                    c="1"+c
                    j=0
            elif newChar=="1":
                if j==0:
                    c="1"+c
                else:
                    c="0"+c
            else:
                if j==0:
                    c="0"+c
                    j=1
                else:
                    c="1"+c
            x-=1
            y-=1
        if j==1:
            return "1"+c
        else:
            return c




