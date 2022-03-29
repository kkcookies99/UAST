 class Solution:
    def XXX(self, num: int) -> str:
        ans = ""
        Dict = {0:"",1:"I",5:"V",10:"X",50:"L",100:"C",500:"D",1000:"M"}
        Preffix = {1000:100,500:100,100:10,50:10,10:1,5:1,1:0}
        Units = [1000,500,100,50,10,5,1]
        for i in range(7):
            if num==0:
                break
            unit = Units[i]
            adds = num//unit
            ans += Dict[unit]*adds
            num %= unit
            if num>=unit-Preffix[unit]:
                ans += Dict[Preffix[unit]] + Dict[unit]
                num -= unit-Preffix[unit]
        return ans



