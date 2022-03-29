 class Solution(object):
    def XXX(self, n):
        # 递归法（24ms，90%）
        # 定义函数：给定数字字符串，返回对应的描述
        def saystr(inStr):
            outStr, p = "", 0 # 定义输出字符串，左指针定位到0
            for q in range(len(inStr)): # 右指针移动
                if inStr[q] != inStr[p]: # 若两指针数字不相等
                    outStr += str(q-p)+inStr[p] # 共有（右-左）个左指针值
                    p = q # 左指针定位到右指针
            outStr += str(q+1-p)+inStr[p] # 遍历结束后，处理末位数字
            return outStr
        # 递归判断
        if n == 1: # 终止条件n=1
            return "1"
        else: # 开始递归
            return saystr(self.XXX(n-1))

