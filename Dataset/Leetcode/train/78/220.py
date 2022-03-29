class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def L(n):
            if n == 1:
                return [[0],[1]]
            return [x + [0] for x in L(n-1)]+[x+[1] for x in L(n-1)]
        A = L(len(nums))
        P=[[nums[k] for k in range(0,len(nums)) if a[k]==1] for a in A]
        return P

