 class Solution(object):
    def XXX(self, s, numRows):
        ans = ""
        if numRows == 1:
            return s
        for n in range(numRows):
            start = n
            while start < len(s):
                ans += s[start]
                if 0<n<numRows-1:
                    temp = start+2*(numRows-1-n)
                    if temp < len(s):
                        ans += s[temp]
                start += (numRows-1)*2
        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

