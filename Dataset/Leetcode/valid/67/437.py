class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str

        核心思想：
                有两种解决办法：
                    1. 直接用Python的强制类型转换 return bin(int(a,2)+int(b,2))[2:]
                    2. 用二进制算法来算 为2进1  模拟进位
                        先补位，将短位数补成长的位数长度
                        在进行进位加法
        """
        result = '' # 结果先用字符串存储
        lenA = len(a)
        lenB = len(b)
        if lenA > lenB:
            str0 = ['0' for i in range(lenA-lenB)]
            t = ''.join(str0)
            b = t + b
            lenB = lenA
        elif lenB > lenA:
            str0 = ['0' for i in range(lenB - lenA)]
            t = ''.join(str0)
            a = t + a
            lenA = lenB
        flag = False # 用来表示短位相加之后是否会进位
        for i in range(lenA):
            tt = 0 # 进位1
            if flag:
                tt = 1
            #print(int(a[lenA-i-1]))
            #print(int(b[lenA-i-1]))
            temp = int(a[lenA-i-1]) + int(b[lenA-i-1]) + tt
            if temp == 3:
                flag = True
                result = '1' + result
            elif temp == 2:
                flag = True
                result = '0' + result
            else:
                flag = False
                result = str(temp) + result
        if flag:
            result = '1' + result
        return result

if __name__ == '__main__':
    s = Solution()
    print(s.XXX("1", b = "111"))



