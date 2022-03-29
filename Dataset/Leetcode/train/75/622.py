 class Solution:
    def shift(self,nums,start,end):
        root = start
        while 1:
            child = root*2+1
            if child > end:
                break
            if child+1 <= end and nums[child+1] > nums[child]:
                child += 1
            if nums[root] < nums[child]:
                nums[root],nums[child] = nums[child],nums[root]
                root = child
            else:
                break
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        first = (len(nums)-1)//2
        for start in range(first,-1,-1):
            self.shift(nums,start,len(nums)-1)
            
        for end in range(len(nums)-1,0,-1):
            nums[end],nums[0] = nums[0],nums[end]
            self.shift(nums,0,end-1)

