 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        
        i=0
        j=n-1
        while i<=j:
            if nums[i]==0:
                nums.pop(i)
                nums.insert(0,0)
                i+=1
            elif nums[i]==2:
                nums.pop(i)
                nums.insert(j,2)
                j-=1
            else:
                i+=1

