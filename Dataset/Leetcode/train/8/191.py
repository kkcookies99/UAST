class Solution(object):
    def XXX(self, str):
        coll=''
        str=str.strip()#删除两端的空格
        
        #判空
        if str=='':
            return 0
        
        t=len(str)
        min=-2147483648
        max=2147483647
        
        #用来存储连续的数字
        store=''
        
        #首位字符是正号或负号
        if str[0] in {'+','-'}:
            if t==1:
                return 0
            elif str[1]>='0' and str[1]<='9':
                store+=str[0]
            else:
                return 0
        #首位字符是数字
        elif str[0]>='0' and str[0]<='9':
            store+=str[0]
        #首位字符是除数字和正负号之外的其他字符
        else:
            return 0
        
        #如果首位字符是正负号，同时第二位字符是数字；或者首位字符是数字，则：
        for i in range(1,t):
            if str[i]>='0' and str[i]<='9':
                store+=str[i]
            else:
                break
        
        #判别输出更新
        out=int(store)
        if out<min:
            out=min
        elif out>max:
            out=max
        return out

