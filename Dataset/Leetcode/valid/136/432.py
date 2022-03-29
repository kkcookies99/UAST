 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        t=len(nums)
        i=0
        if t>1:
            while i<t:
                if i==0:
                    if nums[i]!=nums[i+1]:
                        return nums[i]
                        break
                    else:
                        i+=2
                elif i==t-1:
                    if nums[i]!=nums[i-1]:
                        return nums[i]
                        break
                else:
                    if nums[i]==nums[i+1]:
                        i+=2
                    else:
                        return nums[i]
                        break
        else:
            return nums[0]

