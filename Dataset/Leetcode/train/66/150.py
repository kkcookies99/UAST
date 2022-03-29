 class Solution:
    def XXX(self, digits: list[int]) -> list[int]:
        #得到整数值num
        num = map(str, digits)
        num = int(''.join(num))
        #在num的基础上加1
        num = num+1
        digits = list(map(eval,str(num)))
        return digits

