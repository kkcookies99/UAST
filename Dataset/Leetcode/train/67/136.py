 class Solution:
    def XXX(self, a: str, b: str) -> str:
        diff = '0' * abs(len(a)-len(b))
        if len(a) < len(b):
            a = diff + a
        else:
            b = diff + b
        sum = ''
        carry = 0
        index = len(a) - 1
        while index >= 0:
            if (int(a[index]) + int(b[index])) == 2:
                if carry == 1:
                    sum += '1'
                else:
                    sum += '0'
                    carry =1
            elif (int(a[index]) + int(b[index])) == 1:
                if carry == 1:
                    sum += '0'
                    carry = 1
                else:
                    sum += '1'
            else:
                if carry == 1:
                    sum += '1'
                    carry = 0
                else:
                    sum += '0'
            index -= 1
        if carry == 1:
            sum += '1'
        return sum[::-1]

