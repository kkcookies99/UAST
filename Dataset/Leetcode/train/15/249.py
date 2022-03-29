 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        answer = []
        if len(nums) < 3:
            return answer
        nums.sort()
        for i in range(0,len(nums)-2):
            if nums[i] > 0:
                continue
            elif nums[i-1] != None :
                if nums[i-1] == nums[i]:
                    continue
            j = i + 1
            k = len(nums)-1
            while j < k :
                if nums[i]+nums[j]+nums[k] > 0:
                    k = k-1
                    while nums[k] == nums[k+1]:
                        k = k - 1
                        if k == j:
                            continue
                elif nums[i]+nums[j]+nums[k] < 0:                  
                    j = j+1
                    while nums[j] == nums[j-1]:
                        j = j+1
                        if j >= k:
                            continue
                else:
                    answer.append([nums[i],nums[j],nums[k]])
                    k = k - 1
                    while nums[k] == nums[k+1]:
                        k = k - 1
                        if k == j:
                            continue
                    j = j + 1
                    while nums[j] == nums[j-1]:
                        j = j+1
                        if j >= k:
                            continue
        return answer



