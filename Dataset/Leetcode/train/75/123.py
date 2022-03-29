class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        idx = 0
        hashmap = {}
        for num in nums:
            hashmap[num] = hashmap.get(num, 0) + 1
        for i in [0, 1, 2]:
            if i in hashmap:
                nums[idx : idx + hashmap[i]] = [i] * hashmap[i]
                idx += hashmap[i]

