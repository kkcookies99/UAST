 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        hashmap={}
        for key,value in enumerate(nums):
            value1=target-value
            if value1 in hashmap.keys():
                return [key,hashmap[value1]]
            hashmap[value]=key

