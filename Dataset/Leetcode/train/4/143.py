 # 常规思想
class Solution:
    def XXX(self, A: List[int], B: List[int]) -> float:
        m = len(A)
        n = len(B) 
        lens = m + n
        left, right = -1, -1
        aStart, bStart = 0, 0
        for i in range(lens//2 + 1) :
            left = right  # 每次循环前将 right 的值赋给 left
            # A移动的条件: B遍历到最后 或 当前A<B,满足一个即可
            if aStart < m and (bStart >= n or A[aStart] < B[bStart]):
                right = A[aStart]
                aStart += 1
            else :
                right = B[bStart]
                bStart += 1
            
        if (lens & 1) == 0: # 与1交,判断奇偶数,更快速
            return (left + right) / 2.0
        else:
            return right


