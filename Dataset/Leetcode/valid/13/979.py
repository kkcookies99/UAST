 class Solution:
    def XXX(self, s: str) -> int:
        dic={'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
        num=0
        s1=s
        for i in range(len(s)-1):
            if s[i]+s[i+1] in dic.keys():
                num+=dic.get(s[i]+s[i+1])
                s1=s1.replace(s[i]+s[i+1],'')
        ls_str=['I','V','X','L','C','D','M']
        ls_val=[1,5,10,50,100,500,1000]
        ls_num=[]
        for j in range(7):
            n=0
            for i in range(len(s1)):
                if s1[i]==ls_str[j]:
                    n+=1
            ls_num.append(n)
        for i in range(7):
            num+=ls_val[i]*ls_num[i]
        if num>=1 and num <=3999:
            return num
        else:
            print("输入的罗马数字超出范围！")

