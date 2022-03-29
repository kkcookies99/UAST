 class Solution:
    def XXX(self, nums: List[int]) -> int:
        left,right = 0,0
        while(right<len(nums)):
            if(nums[left]!=nums[right]):
                left+=1
                nums[left]=nums[right]
            right+=1
        return left+1

