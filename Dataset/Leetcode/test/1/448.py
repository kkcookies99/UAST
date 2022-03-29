 class Solution(object):
    def XXX(self, nums, target):
        l = len(nums)
        print(nums)
        ans=[]
        for i in range(l-1):
            for j in range(i+1,l):
                if nums[i]+nums[j] == target:
                    if i not in ans:
                        if j not in ans:
                            ans.append(i)
                            ans.append(j)
                            print([i,j])
                            break
                        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


