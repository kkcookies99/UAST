 def singleNumber(self, nums: List[int]) -> int:
    if len(nums)==1:
        return nums[0]
    nums.sort()
    j=0
    for i in range(1,len(nums),2):
        if  nums[j]==nums[i]:
            j+=2
    return nums[j]

