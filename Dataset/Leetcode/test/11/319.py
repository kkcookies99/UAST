class Solution:
    def XXX(self, height: List[int]) -> int:
        left, right = 0, len(height)-1
        max_res = 0
        while left < right:
            max_res = \
                max(max_res, (right - left) * min(height[left], height[right]))
            if height[left] < height[right]:
                left = left + 1
            else:
                right = right - 1
        return max_res


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

