 class Solution(object):
        def XXX(self,nums,target):
            hashmap = {}
            for index,num in enumerate(nums):
                another_num = target - num
                if another_num in hashmap:
                    return [hashmap[another_num], index]
                hashmap[num] = index
            return None

