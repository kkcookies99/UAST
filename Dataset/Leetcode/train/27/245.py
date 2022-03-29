 class Solution:  
    def XXX(self, nums: List[int], val: int) -> int:  
        nums = list(filter(lambda x: x != val, nums))
        return len(nums)   

