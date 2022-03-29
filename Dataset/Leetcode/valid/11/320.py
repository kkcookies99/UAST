class Solution:
    def XXX(self, height: List[int]) -> int:
        res=0
        i=0
        j=len(height)-1
        while(i<j):
            if height[i]>height[j]:
                res=max(res,height[j]*(j-i))
                j-=1
            else:
                res=max(res,height[i]*(j-i))
                i+=1
        return res
# 执行用时：200 ms, 在所有 Python3 提交中击败了73.38%的用户
# 内存消耗：23.9 MB, 在所有 Python3 提交中击败了85.83%的用户
————————————————
版权声明：本文为CSDN博主「黑黑白白君」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/m0_37621024/article/details/117886947

