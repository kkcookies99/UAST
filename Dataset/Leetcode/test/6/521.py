 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        n=len(s)
        if n<=numRows or numRows==1:#排除一些特殊情侣
            return s
        step=2*numRows-2#一个step就一个形如IV即一列+一个对角线，不包括右上角
        p=[]#重新组合
        for i in range(0,n,step):#按step划分（分成两个部分，一列[i,i+numRows)，斜对角线[i+numRows,i+step) )
            for j in range(i,i+numRows):#列直接插入
                if j<n:
                    p.append(s[j])
                else:#若已经是最后一个列，直接填充""
                    p.append("")
            #斜对角线前后填充""
            p.append("")
            for k in range(i+step-1,i+numRows-1,-1):#斜对角线按原顺序倒序插入
                if k<n:
                    p.append(s[k])
                else:#若已经是最后一个列，直接填充""
                    p.append("")
            p.append("")
            #斜对角线前后填充""
        res=""
        #将斜对角线压缩成一列来看待
        for i in range(numRows):#按numRows取值
            count=i
            for j in range(len(p)//numRows):#计算有几个numRows
                res+=p[count]#每次间隔numRows取值
                count+=numRows
        return res

