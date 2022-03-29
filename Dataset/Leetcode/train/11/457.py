 class Solution:
    def XXX(self, height: List[int]) -> int:
        ans = 0 
        left, right = 0, len(height) - 1
        while(left < right):
            ans = max(ans, min(height[left], height[right])*(right-left))
            if height[left] > height[right]:
                right -= 1
            else:
                left += 1
        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


