 class Solution:
    def XXX(self, num: int) -> str:
        ans = ""
        dic = {(0,1):"I",(0,5):"V",(1,1):"X",(1,5):"L",(2,1):"C",(2,5):"D",(3,1):"M"}
        for i in range(4):
            left = num % 10
            num = num // 10
            if left==0:
                continue
            elif left<=3:
                ans = dic[(i,1)]*left + ans
            elif left==4:
                ans = dic[(i,1)] + dic[(i,5)] + ans
            elif left<9:
                ans = dic[(i,5)] + (left-5)*dic[(i,1)] + ans
            else:
                ans = dic[(i,1)] + dic[(i+1,1)] + ans
            if num == 0:
                return ans

