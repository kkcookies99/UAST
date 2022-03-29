 class Solution:
    def XXX(self, height: List[int]) -> int:
        l, r, res = 0, len(height) - 1, 0
        while l < r:
            res = max(res, min(height[l], height[r]) * (r - l))
            if height[l] < height[r]:
                i = l + 1
                while i < r and height[i] <= height[l]: i += 1
                l = i
            else: 
                j = r - 1
                while j > l and height[j] <= height[r]: j -= 1
                r = j
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


