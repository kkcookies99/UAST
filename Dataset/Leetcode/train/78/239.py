class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        result=[[]]
        size=len(nums)
        for i in range(size):
            for j in range(len(result)):
                result.append([nums[i]]+result[j])
        return result

