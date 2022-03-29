class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        a = -1
        for b in digits:
            a += 1
        digits[a] += 1
        while True:
            for c in digits:
                if c == 10:
                    d = digits.index(10)
                    digits[d] = 0
                    d -= 1
                    if d == -1:
                        digits.insert(0, 1)
                        break
                    else:
                        digits[d] += 1

            if max(digits) != 10:
                return digits
                

