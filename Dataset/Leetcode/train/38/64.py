class Solution:
    def XXX(self, n: int) -> str:
        temp1='1'
        for i in range(2,n+1):
            temp2=''
            count=1
            for j in range(1,len(temp1)):
                if temp1[j]==temp1[j-1]:
                    count+=1
                else:
                    temp2+=str(count)+temp1[j-1]
                    count=1
            temp2+=str(count)+temp1[-1]
            temp1=temp2
        return temp1
                

