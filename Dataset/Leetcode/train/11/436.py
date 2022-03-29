 class Solution:
    def XXX(self, height: List[int]) -> int:
        L = len(height)
        ret, lo, hi = 0, 0, L - 1
        ret = (hi - lo)*min(height[lo],height[hi])
        while lo < hi:
            if height[lo] < height[hi]:
                lo = lo + 1
            else:
                hi = hi - 1
            ret = max(ret, (hi - lo)*min(height[lo],height[hi]))
        return ret

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


