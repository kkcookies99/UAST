class Solution(object):
    def XXX(self,str):
        print(str)  #打印出来为了方便对比结果
        n = len(str)#输入字符串长度
        num = 0     #计数器，用于计算空的字符
        temp = ''   #创建临时空字符变量方便存储所需得字符
        # 特例排除，n = 0, n=1且为非实数，n>1且首字符为非空，非正负号，非数字
        if n == 0:  # ''，输入为空时输出0
            return 0
        if n == 1 and str[0] not in ['0', '1', '2', '3', '4', 
                                     '5', '6', '7', '8', '9']:  # '+', '-'，'w' 输入为单字符但是为非数字时
            return 0        
        # for 循环用于调用n>=1 且开头为空格，正负号，或者数字
        # if 语句条件分为元素为空格
        # if 语句条件分为元素为'-', '+'
        # if 语句条件分为元素为'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        # 三种情况
        # 和遍历完之后的处理
        for i in range(n):            
            # if 语句分为元素为空格 
            if str[i] == ' ':
                num += 1
                if num == n:
                    return 0
                elif len(temp) > 0:
                    if temp in ['-', '+']:  # "- 123"
                        return 0
                    else:
                        return int(temp)  # "-0 123" 
                else:
                    continue

            # if 语句条件分为元素为'-', '+'
            if str[i] in ['-', '+']:  # "+-2", "-+2", "+1", "-1"
                temp = temp + str[i]  # 
                if len(temp) == 1:
                    continue
                if len(temp) == 2 and temp[0] in ['-','+']:  #少这句'-5-'报错，这句和下句颠倒 '+-2'报错
                    return 0
                if len(temp) > 1 and (temp[-1] in ['-', '+']): # '0-1'
                    temp = temp[0:-1]
                    return temp    
                
            # if 语句条件分为元素为'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
            if str[i] in ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']:
                temp = temp + str[i] 
                if len(temp) > 1 and int(temp) < -2**31:
                    temp = '-2147483648'
                if len(temp) > 1 and int(temp) > 2**31 - 1:
                    temp = '2147483647'
                if len(temp) == 2 and temp[0] == '0': # '00001'
                    temp = temp[1]
                    continue
                if len(temp) > 1 and temp[0] == '+':  # "+1"
                    temp = temp[1:]
                else:
                    continue
            else:
                if len(temp) > 1:  # '-0012a42'
                    return int(temp)
                if len(temp) == 1 and temp[0] in ['-', '+']:  # '-abd'
                    return int(temp + '0')
                if len(temp) == 0:
                    return 0
                else:
                    return temp

        return int(temp)

