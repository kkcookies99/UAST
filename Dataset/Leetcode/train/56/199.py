 class Solution:
    def XXX(self, nums: List[List[int]]) -> List[List[int]]:
        ans, l, r = [], -float('inf'), -float('inf')
        for i, j in nums.sort() or nums:
            if i <= r:
                r = max(r, j)
            else:
                ans.append([l, r])
                l, r = i, j
        return ans.append([l, r]) or ans.pop(0) and ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


