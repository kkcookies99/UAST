class Solution:
    def XXX(self, str: str) -> int:
        str = str.lstrip()  # 去除左空格
        if len(str) == 0:
            return 0
        # 定义字符索引
        index = 0
        # 如果首位为符号位，索引右移1位
        if str[0] in ["-","+"]:
            index = 1
        # 如果当前位为零或者不是数字，则不是可转换的有效格式
        if len(str[index:]) == 0 or not str[index].isdecimal():
            return 0
        # 统计有效数字位的索引
        while index < len(str):
            if not str[index].isdecimal():
                break
            index += 1
        # 按照索引取截取字符串
        str = int(str[:index])
        # 溢出控制
        if str < -2**31:
            return -2**31
        if str > 2**31 -1:
            return 2**31 -1
        return str

