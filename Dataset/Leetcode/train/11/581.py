 class Solution:
    def XXX(self, height: List[int]) -> int:
        ans = -1
        for i in range(len(height)-1):
            for j in range(i+1,len(height)):
                area = (j-i)*min(height[i],height[j])
                if area > ans:
                    ans = area
        return ans


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


