 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        print(nums[int(len(nums)/2):])
        if len(nums) == 1:
            if target<=nums[0]:
                return 0
            else:
                return 1 
        if target>nums[int(len(nums)/2)-1]:
            return int(len(nums)/2)+self.XXX(nums[int(len(nums)/2):],target)
        elif target==nums[int(len(nums)/2)-1]:
            return int(len(nums)/2)-1
        else:
            return self.XXX(nums[0:int(len(nums)/2)],target)

