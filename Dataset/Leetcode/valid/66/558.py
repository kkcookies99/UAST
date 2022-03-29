class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        len1=len(digits)
        i=0
        num=0
        list_end=[]
        while i<len1:
            num+=int(digits[i]*(10**(len1-i-1)))
            i+=1
        num=str(num+1)
        numlist=list(num)
        for i in numlist:
            list_end.append(int(i))
            #print(list_end)
        return list_end




