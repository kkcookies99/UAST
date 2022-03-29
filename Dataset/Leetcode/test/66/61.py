 class Solution:
    """
    first time:15 min
    total time:15 min
    time complexity:O(n)
    space complexity:O(1)
    idea:从列表的最后一项开始从后往前依次判断，如果不等于9，该项加1完事，如果等于9，该项赋值0，
         继续判断下一项。最后判断列表首项是否等于0，如果等于0，再添一个头元素1即可。
    """
    def XXX(self, digits: List[int]) -> List[int]:
        head=[1]
        for i in range(len(digits)-1,-1,-1):
            if digits[i]!=9:
                digits[i]+=1
                break
            else:
                digits[i]=0
        if digits[0]==0:
            return head+digits
        else:
            return digits

