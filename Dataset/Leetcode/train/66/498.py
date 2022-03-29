class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        n = len(digits)
        flag = 0
        for i in range(n - 1, -1, -1):
            tmp = digits[i] + 1
            if tmp < 10:
                digits[i] = tmp
                flag = 1
                break
            else:
                digits[i] = 0
                continue
        if flag == 0:
            digits.insert(0, 1)
        return digits

