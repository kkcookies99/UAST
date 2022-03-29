 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        print(nums)
        for k in range(len(nums)-2):
       
            if nums[k]==nums[k-1] and k >=1:
                continue
            rest_sum = -nums[k]
            i = k+1
            j = len(nums)-1
            while i < j:
                if nums[i]+nums[j]>rest_sum:
                    j = j-1
                elif nums[i]+nums[j]<rest_sum:
                    i = i+1
                elif nums[i]+nums[j]==rest_sum:
                    res.append([nums[k],nums[i],nums[j]])
                    i = i+1 
                    j = j-1
                    while (nums[i-1]==nums[i]) and (i<j):
                        i = i+1
                    while nums[j+1]==nums[j] and i<j:
                        j = j-1
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


