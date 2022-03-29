 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        s_length = len(s)
        mark = [[0 for i in range(s_length)] for _ in range(s_length)]
        max_length = 0
        max_sub_str = ""
        
        for j in range(0, s_length):
            for i in range(0, j + 1):
                if j - i <= 1:
                    if s[i] == s[j]:
                        mark[i][j] = 1
                        if max_length < j - i + 1:
                            max_sub_str = s[i:j+1]
                            max_length = j - i + 1
                else:
                    if s[i] == s[j] and mark[i+1][j-1]:
                        mark[i][j] = 1
                        if max_length < j - i + 1:
                            max_sub_str = s[i:j+1]
                            max_length = j - i + 1
        return max_sub_str
                        

