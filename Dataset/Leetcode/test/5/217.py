 class Solution:
    def XXX(self, s: str) -> str:
        n=len(s)
        res_len=[]
        res_list=[]
        if n==0:
            res=0
        else:
            for i in range(n-1):
                for j in range(i+2,n+1):
                    #print("i\t"+str(i))
                    #print("j\t"+str(j))
                    #print(s[i:j])
                    #print(s[::-1].find(s[i:j])==n-i-len(s[i:j]))
                    if s[::-1].find(s[i:j])==n-i-len(s[i:j]):
                        res_len.append(j-i)
                        res_list.append(s[i:j])
            if len(res_len)==0:
                res=s[0]
            else:
                res=res_list[res_len.index(max(res_len))]
        return res

