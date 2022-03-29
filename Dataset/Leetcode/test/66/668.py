class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        index = len(digits)-1
        res = []
        reb = 1
        while index >= 0:
            reb += digits[index]
            res.append(reb % 10)
            reb //= 10
            index -= 1
        if reb:res.append(1)
        return res[::-1]

