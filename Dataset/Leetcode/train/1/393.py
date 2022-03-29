 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:

        map = dict()
        for k, v in enumerate(nums):
            map[v] = k
        
        for i in range(len(nums)):
            num = target - nums[i]
            if num in map and map.get(num) != i:
                return [i, map[num]]


