class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        size=len(digits)
        temp_sum=1
        ans=[]
        if size==1:
            temp_sum+=digits[0]
        if size>1:
            for i,num in enumerate(digits):
                temp_sum+=num*(10**(size-i-1))
            print(temp_sum)
        while temp_sum>0:
            new_num=temp_sum%10
            ans.append(new_num)
            temp_sum//=10                    
        return ans[::-1]

