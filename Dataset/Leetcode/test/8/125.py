class Solution:
    def XXX(self, str: str) -> int:
        sign=1
        str=str.strip()
        if not str:
            return 0
        if str[0]=="+" or str[0]=="-":
            if str[0]=="-":
                sign=-1
            str=str[1:]
        ans=0
        for i in str:
            if i.isdigit():
                ans=ans*10+int(i)
            else:
                break
        ans*=sign
        if ans>2147483647:
            return 2147483647
        elif ans<-2147483648:
            return -2147483648
        else:
            return ans

        

