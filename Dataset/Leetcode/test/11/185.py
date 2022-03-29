class Solution:
    def XXX(self, height: List[int]) -> int:
        ans = []
        r = len(height) - 1
        l = 0
        while(l < r):
            area = (r - l) * min(height[l], height[r])
            ans.append(area)
            if height[l] < height[r]:
                l = l + 1
            else:
                r = r - 1
        return max(ans)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

