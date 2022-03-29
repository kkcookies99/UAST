 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        #第一行的字母均相距2*（numRows - 1) 第二行为第一步 n-2 + n-2 和 第二步 2*n-2 -(2*n-4) 即相加为2*n-2步
        #第三行的为 n-3+ n-3  2*n-2 -(2*n-6)
        #可得 第N行的 第一步为2*（numRows - N） 第二步 为2（numRows - 1） -2*（numRows - N）
        s1 = ''
        if numRows==1:return(s)
        for i in range(1,numRows+1):
            num = i-1   #计算开始节点
            d = [0,0] 
            d[0] = 2*(numRows - i)   #第一步
            d[1] = 2*(numRows - 1) - 2*(numRows - i) #第二步
            # 进入循环，将每一行的字符加入进字符串中
            while num<len(s):    
                for j in range(2):
                    if d[j]!=0 and num<len(s):
                        s1 += s[num]
                        num += d[j]       #num指向需要添加的字符
                    if num>=len(s):    
                        break
        return(s1)    

