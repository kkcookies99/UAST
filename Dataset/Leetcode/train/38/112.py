class Solution(object):
    def XXX(self, n):
        if n == 1:
            return "1"
        s = self.XXX(n-1)
        res = ""
        i = 0
        start = 0
        while i < len(s) - 1:
            if s[i+1] == s[i]:
                pass
            else:
                tmp = s[start:i+1]
                start = i + 1
                if tmp != "":
                    res += str(len(tmp))
                    res += tmp[0]
            i += 1
        tmp = s[start:i+1]
        start = i + 1
        if tmp != "":
            res += str(len(tmp))
            res += tmp[0]

        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


