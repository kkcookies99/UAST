 class Solution(object):
    def XXX(self, digits):
        sum = 0
        for i in range(len(digits)):
            sum = sum*10 + digits[i]
        sum=sum+1
        ls=[]
        while(sum!=0):
            y=sum%10
            sum=sum/10
            ls.append(y)
            i=i+1
        
        ls.reverse()
        return ls

