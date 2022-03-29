 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        num = 0
        for i in nums:
            if(i == val):
                num+=1
        
        for i in range(0,num):
            nums.remove(val)
            nums.append(val)
        
        return len(nums) - num

