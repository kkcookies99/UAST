 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i,j =0,0
        for num in nums:
            if num == 0: i+=1
            if num == 1: j+=1
        
        i-=1
        j+=i
        
        for n in range(len(nums)):
            if n<=i:
                nums[n] = 0
            elif n<=j:
                nums[n] = 1
            else:
                nums[n] = 2

