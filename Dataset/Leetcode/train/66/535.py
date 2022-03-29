class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        s=''
        for i in digits:
            s+=str(i)
        s=int(s)+1
        lst=[]
        for j in str(s):
            lst.append(int(j))
        return lst

