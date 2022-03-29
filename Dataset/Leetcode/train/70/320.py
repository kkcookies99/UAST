class Solution:
    def XXX(self, n: int) -> int:
        def func(m,n):
            a=b=result=1
            minNI=min(n,m-n)#使运算最简便
            for j in range(0,minNI):
            #使用变量a,b 让所用的分母相乘后除以所有的分子
                a=a*(m-j)
                b=b*(minNI-j)
                result=a//b #在此使用“/”和“//”均可，因为a除以b为整数
            return result

        m=n//2
        num=1
        for i in range(1,m+1):
            n=n-1
            result=func(n,i)
            num=num+result
        return num

