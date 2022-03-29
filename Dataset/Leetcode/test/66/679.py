class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        str1=''
        for i in digits:
            str1+=str(i)
        str1=str(int(str1)+1)
        digits=[]
        for j in str1:
            digits.append(int(j))
        return digits  

