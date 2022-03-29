class Solution:
    def XXX(self, height: List[int]) -> int:
        i,j = 0,len(height)-1
        maxarea = 0
        while i < j:
            area = min(height[i],height[j])*(j-i)
            maxarea = max(maxarea,area)
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return maxarea

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

