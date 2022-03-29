class Solution:
    def XXX(self, nums: List[int]) -> int:
        if nums == [0]:
            return 0
        a = []
        b = nums
        i = 0 
        while i < len(b):
            if sum(b[:i+1]) > 0:
                a.append(sum(b[:i + 1]))
                i = i+1
            else:
                if i < len(b)-1:
                    b = b[i+1:]
                    i = 0
                else:
                    break
        if a == []:
            return max(nums)
        return max(a)

