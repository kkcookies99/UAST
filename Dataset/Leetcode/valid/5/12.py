 class Solution:
    def XXX(self, s: str) -> str:
        n = len(s)

        def findbound(l,r):
            while l>=0 and r<n and s[l]==s[r]:
                l -= 1
                r += 1
            return l+1, r-1

        left, right = 0, 0
        for i in range(n):
            l_1, r_1 = findbound(i, i)
            l_2, r_2 = findbound(i, i+1)
            if r_1 - l_1 > right - left:
                left, right = l_1, r_1
            if r_2 - l_2 > right - left:
                left, right = l_2, r_2
        
        return s[left : right+1]


