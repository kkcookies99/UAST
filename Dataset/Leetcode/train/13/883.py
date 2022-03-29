 class Solution:
    def XXX(self, s: str) -> int:
        maps = dict()
        maps['I'] = 1
        maps['V'] = 5
        maps['X'] = 10
        maps['L'] = 50
        maps['C'] = 100
        maps['D'] = 500
        maps['M'] = 1000
        maps['IV'] = 4
        maps['IX'] = 9
        maps['XL'] = 40
        maps['XC'] = 90
        maps['CD'] = 400
        maps['CM'] = 900

        ans = 0
        flag = False
        n = len(s)
        for i in range(n):
            if flag:
                flag = False
                continue
            if i<n-1 and s[i] in 'IXC':
                if s[i]+s[i+1] in maps:
                    ans += maps[s[i]+s[i+1]]
                    flag = True

                else:
                    ans += maps[s[i]]
            else:
                ans += maps[s[i]]
        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


