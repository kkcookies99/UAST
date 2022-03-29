     def XXX(self, s: str) -> int:
        s = s.lstrip() # 去除头部空格。中间空格需保留
        # 长度为0，或第一个数为字母或'.'
        if len(s) == 0 or s[0].isalpha() or s[0] == '.': return 0
        if s[0] == '-': sign = -1 # 获得符号
        else: sign = 1
        if s[0] in ['+', '-']: s = s[1:] # 过滤符号
        # 找到合理数字结束的位置。如遇到非数字（加减或点或字母），break
        break_flag = False
        for ind, string in enumerate(s):
            if not string.isnumeric(): # 如果非数字，break
                break_flag = True
                break
        # 如果有break，返回s的subset
        if break_flag: s = s[:ind]
        # 检查leading 0's
        i = 0
        while i < len(s) and s[i] == '0': i += 1 # 找到第一个非零的index
        s = s[i:] # 去掉这些0
        if len(s) == 0: return 0 # 去0后检查
        if sign == 1: return self.boundcut(2**31 - 1, s)
        elif sign == -1: return -self.boundcut(2**31, s)
            
    def boundcut(self, max_num, digits):
        """用于检查是否越界"""
        max_num = str(max_num)
        if len(digits) > len(max_num): return int(max_num)
        elif len(digits) < len(max_num): return int(digits)
        else: # 相同长度下，用sort来比较两个字符串。sort排在前面的数字小
            if sorted([max_num, digits])[0] == max_num:
                return int(max_num)
            else: return int(digits)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


