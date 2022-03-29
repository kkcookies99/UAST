 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        sets = [[]]       
        for num in nums:
            sets += [set +[num] for set in sets]
        return sets

