 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        def isPalindromeStr(sub_s):
            return sub_s == sub_s[::-1]
        if len(s) < 2 or isPalindromeStr(s):
            return s
        res = s[0]
        l = len(s)
        for i in range(l-1):
            for j in range(l+1, i+1, -1):
                # print i,j
                if len(res) >= j - i:
                    break
                tmps = s[i:j]
                # print tmps
                if tmps[0] != tmps[-1]:
                    continue
                res = tmps if isPalindromeStr(tmps) else res
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

