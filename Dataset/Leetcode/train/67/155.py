 class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        # 思路：首先判断两个字符串长短，倒序，补齐短字符串，然后做带进位加法
        flag = 0      
        if len(a) >= len(b):
            a = list(a[::-1])
            b = list(b[::-1] + '0'*(len(a)-len(b)))
            for i in range(len(a)):
                temp = int(a[i]) + int(b[i]) + flag
                if temp >= 2:
                    a[i] = str(temp - 2)
                    flag = 1
                else:
                    a[i] = str(temp)
                    flag = 0
            
            # 判断首位是否有进位
            if flag == 1:
                a.append('1')
            return ''.join(a[::-1])     
        else:
            a = list(a[::-1] + '0'*(len(b)-len(a)))
            b = list(b[::-1])
            for i in range(len(a)):
                temp = int(b[i]) + int(a[i]) + flag
                if temp >= 2:
                    b[i] = str(temp - 2)
                    flag = 1
                else:
                    b[i] = str(temp)
                    flag = 0
            if flag == 1:
                b.append('1')
            return ''.join(b[::-1])
        

