class Solution(object):
    def XXX(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        a = 0
        for index, X in enumerate(height):
            for j in range(len(height)):
                res = min(X, height[j])
                location = index - j
                a = max(a, res*location)

        return a

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

