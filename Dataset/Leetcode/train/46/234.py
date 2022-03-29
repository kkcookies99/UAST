class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        if n ==0:
            return []
        ans = [[nums[0]],]
        for i in range(1, n):
            temp = []
            for a in ans:
                for j in range(i+1):
                    a.insert(j, nums[i])
                    temp.append(a.copy())
                    try:
                        del a[j]
                    except:
                        pass
            ans = temp
        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


