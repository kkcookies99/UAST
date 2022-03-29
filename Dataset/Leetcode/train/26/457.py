 class Solution:
    def XXX(self, nums: List[int]) -> int:
        length = len(nums)
        index = 0
        while(index < length-1 and nums[index] <=nums [index+1]):
            if nums[index]==nums[index+1]:
                ele = nums.pop(index+1)  #去最后边
                nums.append(ele)
                continue
            index +=1
        return index+1

