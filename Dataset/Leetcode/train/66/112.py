 class Solution:
    def XXX(self, digits):
        length = len(digits)
        digits.reverse()
        digits[0] += 1
        for i in range(0,length):
            if i < length-1 and digits[i] >= 10:
                digits[i] -= 10
                digits[i+1] += 1
            elif i == length -1:
                if digits[i] >= 10:
                    digits[i] -= 10
                    digits.append(1)
                

        digits.reverse()
        return digits

