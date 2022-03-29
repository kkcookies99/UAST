class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        i = 0
        while i < len(str) and str[i] == ' ':
            i += 1
        if len(str) == 0 or i == len(str) or not(('0' <= str[i] and str[i] <= '9') or str[i] == '-' or str[i] == '+'):
            return 0
        j = i+1
        while j < len(str) and '0' <= str[j] and str[j] <= '9':
            j += 1
        s = str[i:j]
        try:
            ans = int(s)
        except:
            return 0
        ans = 2147483647 if ans > 2147483647 else ans
        ans = -2147483648 if ans < -2147483648 else ans
        return ans

