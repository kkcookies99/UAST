 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        result = []
        j = 0
        for n in nums:
            if n != val:
                result.insert(j, n)
                j+=1
        return (len(result))

