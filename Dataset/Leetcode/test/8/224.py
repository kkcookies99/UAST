class Solution:
    def XXX(self, str: 'str') -> 'int':
        # 数字字符串
        num = ""
        # +、- 符号记录标志
        i = 0
        for s in str:
            # 在数字字符串为空、没有读取过+、-符号的情况下，遇到空白字符串则跳过
            if s == " " and num == "" and i == 0:
                continue
            # 在没有读取过+、-符号的情况下遇到加减符号的操作
            elif (s == "-" or s == "+") and i == 0:
                # 如果数字字符串为空，则读取符号；反之，退出循环
                if num == "":
                    if s == "-":
                        num += s
                    i += 1
                else:
                    break
            # 读取到数字，存入数字字符串中
            elif s.isdigit():
                num += s
            # 若数字字符串为空，返回0；反之，退出循环
            else:
                if num == "":
                    return 0
                else:
                    break
        # 区别num为空或符号的情况，同时对数值的范围进行判断
        try:
            result = int(num)
            if result < -2**31: 
                return -2**31 
            elif result > 2**31-1:
                return 2**31-1
            else:
                return result
        except:
            return 0

