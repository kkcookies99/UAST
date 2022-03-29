 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        ans = ''
        for i in range(len(str)):
            min_ = 0
            if str[0] >= 'a' and str[0] <= 'z' or str[0] >= 'A' and str[0] <= 'Z':
                ans = '0'
                break
            elif str[i] == ' ':
                if ans != '':
                    break
                pass
            elif str[i] == '-' or str[i] == '+':
                if str[i:].find('-') != -1 or str[i:].find('+') != -1:
                    min_ = min(str[i:].find('-'), str[i:].find('+'))
                    for j in range(i, min_):
                        str[j] == ' '
                if str[0:i].count(' ') != len(str[0:i]):
                    break
                ans += str[i]
            elif str[i] >= 'a' and str[i] <= 'z' or str[i] >= 'A' and str[i] <= 'Z' or str[i] == '.':
                if ans == '':
                    ans = '0'
                break
            else:
                ans += str[i]
        if str == '' or str.count(' ') == len(str) or ans == '-' or ans == '+':
            ans = '0'
        ans = int(ans)
        if ans < -(2) ** 31:
            ans = -(2) ** 31
        if ans > 2 ** 31 - 1:
            ans = 2 ** 31 - 1
        return ans


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


