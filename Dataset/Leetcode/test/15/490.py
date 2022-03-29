 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        if n==0 or n<3: return []
        nums.sort()
        ans = []

        for first in range(n):

            if nums[first]>0: return ans

            if first>0 and nums[first] == nums[first-1]: continue

            second = first + 1
            third = n - 1

            while second<third:
                if nums[first]+nums[second]+nums[third]==0:
                    ans.append([nums[first], nums[second], nums[third]])
                    while second<third and nums[second+1]==nums[second]: second += 1
                    while second<third and nums[third-1]==nums[third]: third -= 1
                    second += 1
                    third -= 1
                elif nums[first]+nums[second]+nums[third]>0:
                    third -= 1
                elif nums[first]+nums[second]+nums[third]<0:
                    second += 1
        return ans

