 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        dic = {}
        for i in range (len(nums)):
            if nums[i] not in dic:
                dic[nums[i]] = 0
            dic[nums[i]] += 1
            if dic[nums[i]] == 2:
                del[dic[nums[i]]]
        return(list(dic.keys())[0])

