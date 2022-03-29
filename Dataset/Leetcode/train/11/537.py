 class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        i, j = 0, len(height)-1
        ans = 0
        while j > i:
            ans = max(ans, min(height[i], height[j]) * (j-i))
            if height[i] > height[j]:
                j -= 1
            else:
                i += 1

        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


