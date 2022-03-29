class Solution:
    def XXX(self, n: int) -> str:
        def describe(string):

            des=""
            count=1
            if len(string)==1:
                return "1"+string
            else:
                for i in range(1,len(string)+1):
                    if i==len(string) or string[i]!=string[i-1]:
                        pre=str(count)+string[i-1]
                        des+=pre
                        count=1
                    else:
                        count+=1
                return des
        num=["1"]
        for i in range(1,n):
            a=describe(num[i-1])
            num.append(a)
        return num[n-1]

