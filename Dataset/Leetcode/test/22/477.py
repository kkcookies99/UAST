 class Solution:
    def XXX(self, n: int) -> List[str]:
        res=set()
        def func(sub,left,right):
            if left>n or right>n:
                return
            if left==n:
                while(right<n):
                    sub+=')'
                    right+=1
                res.add(sub)
                return
            if right==n or right>left:
                return
            func(sub+'(',left+1,right)
            func(sub+')',left,right+1)
        func('',0,0)
        return list(res)
# 执行用时：32 ms, 在所有 Python3 提交中击败了97.41%的用户
# 内存消耗：15.2 MB, 在所有 Python3 提交中击败了12.80%的用户
————————————————
版权声明：本文为CSDN博主「黑黑白白君」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/m0_37621024/article/details/117886663

