 class Solution(object):
    def XXX(self,nums,k):
        result = []
        hashtable = {nums[0]:0}
        for i in range(1,len(nums)):
            if (k-nums[i]) in hashtable:
                if [k-nums[i],nums[i]] not in result:
                    result.append([k-nums[i],nums[i]])
            hashtable[nums[i]] = 0
        return result
    def XXX(self, nums):
        nums.sort()
        if len(nums)<3:
            return []
        Result = []
        hashtable = {}
        for i in range(len(nums)-2):
            if nums[i] not in hashtable:
                hashtable[nums[i]]=0
                for result in self.XXX(nums[i+1:],-nums[i]):
                    Result.append([nums[i],result[0],result[1]])
        return Result

