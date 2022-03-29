class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        INT_MAX = 2147483647    
        INT_MIN = -2147483648
        # 1、去除头部空格
        s = s.lstrip()

        # 2、非法字符串判断，长度为 0
        if len(s) == 0 or s[0].isalpha() or s[0] == '.':
            return 0
        
        # 3、正负判断
        if s[0] == '-':
            sign = -1
        else:
            sign = 1

        # 4、不同的字符串开头的情况，截取数字部分
        if s[0] in ['+', '-']: 
            s = s[1:]
        elif s[0] == '0':
            i = 0
            while i < len(s) and s[i] == '0':
                i += 1
            s = s[i:]
        break_flag = False	
        for ind, str in enumerate(s):
            if not str.isnumeric():
                break_flag = True
                break
        if break_flag:
            s = s[:ind]
        else:
            s = s
        print(len(s))

        # 5、结合正负号和截取的数字部分，并与截断范围进行比较，返回结果
        if sign == -1:
            int_s = -1*int(s if s.isnumeric() else 0) # 避免 +- 开头的字符串
        elif sign == 1:
            int_s = int(s if s.isnumeric() else 0)
        return max(min(int_s,INT_MAX),INT_MIN)


