 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        result = [[]]
        nums.sort()
        def backtrack(pix, num):
            if pix not in result:
                result.append(pix)
            for i in range(len(num)):
                if len(pix)==0 or num[i]>pix[-1]:
                    backtrack(pix+[num[i]], num[i+1:])
        backtrack([], nums)
        return result

