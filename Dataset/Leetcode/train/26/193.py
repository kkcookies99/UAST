 class Solution(object):
    def XXX(self, nums):
        tmp=0
        while tmp< len(nums):
            try :
                if(nums[tmp]==nums[tmp+1]):
                    nums.remove(nums[tmp])
                    continue
            except:
                pass
            tmp+=1
        return len(nums)

