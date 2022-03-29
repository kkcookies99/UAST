 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        add=1   #进位
        for i in range(len(digits)-1,-1,-1):
            cur=digits[i]
            if cur+add>9:
                digits[i]=0
                add=1
            else:
                digits[i]=cur+add
                add=0
                break
        return [1]+digits if add==1 else digits

