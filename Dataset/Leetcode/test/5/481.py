 class Solution:
    def XXX(self, s: str) -> str:
        res = ''
        temp = {}
        if len(s) > 0:
            res = s[0]
        for i in range(len(s)):
            if s[i] not in temp:
                temp[s[i]] = []
                temp[s[i]].append(i)
            else:
                temp[s[i]].append(i)
                for j in temp[s[i]]:
                    string = s[j:i+1]
                    reverse = string[::-1]
                    if string == reverse and len(string) > len(res):
                        res = string
                        break
        return res

