class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        import math
        # 去除首尾空白字符
        s = str.strip()

        # 判断第一个非空字符是否有效、字符串是否为空两种情况
        if s == '' or s[0] not in '-+0123456789':
            return 0
        
        # 以+、-符号开头，判断字符串长度是否大于1（+、-单字符无效）
        # 假如字符串大于1，则判断第二个字符是否为数字
        if s[0] in '+-' and (len(s) == 1 or not s[1].isdigit()):
                return 0
            
        # 获取有效的连续数字
        cont_str = ''
        flag = ''
        
        if s[0] in '-+':
            flag = s[0]
            s = s[1:]
        
        for c in s:
            if c.isdigit():
                cont_str += c
            else:
                break
                
        INT_MIN, INT_MAX = -2147483648, 2147483647
        val = int(cont_str)
        if flag == '-':
            return -val if -val >= INT_MIN else INT_MIN 
        else:
            return val if val <= INT_MAX - 1 else INT_MAX
        

