 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1: # 如果是1就返回1
            return '1'
        s = '11'
        for step in range(2,n): # 输入了n就从第二个开始算，利用前一次结果迭代，直到算到第n个
            temp = [] # 用来放字符串碎片
            count = 1 #计数器
            for i in range(len(s)-1): # 例1211
                if s[i+1]==s[i]: # 如果后一个数和前一个数一样，计数+1
                    count+=1
                else:
                    temp.append(str(count)+str(s[i])) # 如果不一样 说明计算完毕，得到一个碎片字符串 ' count 个 s[i]' (11)
                    count=1 # 计数器置为1 开始计算下一个字符串碎片 随后得到12和21两个碎片                
            temp.append(str(count)+str(s[i+1])) # 拼接末尾的情况
            s=''.join(temp) # 最终将['11','12','21'] 拼接成111221 作为下一个step的初始字符串
        return s

