 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        s = "#" + "#".join(s) + "#"
        ls = [0] * len(s)
        
        max_right = 0
        pos = 0
        max_lenght = 0
        result = ""
        
        for i in range(len(s)):
            if i < max_right:
                ls[i] = min(ls[2*pos-i], max_right-i)
            else:
                max_right = 1
            # 尝试扩展
            while i-ls[i] >= 0 and i+ls[i] < len(s) and s[i-ls[i]] == s[i+ls[i]]:
                ls[i] += 1
            # 更新pos和max_right
            if i + ls[i] -1 > max_right:
                max_right = i + ls[i] - 1
                pos = i
            # 更新结果
            if max_lenght < ls[i]:
                max_lenght = ls[i]
                result = s[i-ls[i]+1:i+ls[i]].replace("#","")
        return (result)

