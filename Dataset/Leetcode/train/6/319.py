 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if len(s)<=2 or numRows==1:
            return s
        n=2*(numRows-1)#构建一个V字型需要的字符个数
        step=len(s)//n#可以构成step个完整的V型
        sz=""
        #第一行
        for i in range(step+1):
            try:
                sz+=s[i*n]
            except:
                break
        #中间行
        for row in range(1,numRows-1):
            for i in range(step+1):
                try:
                    sz+=s[i*n+row]
                    sz+=s[i*n+2*numRows-row-2]                    
                except:
                    break
        #最后一行
        for i in range(step+1):
            try:
                sz+=s[i*n+numRows-1]
            except:
                break
        return sz

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

