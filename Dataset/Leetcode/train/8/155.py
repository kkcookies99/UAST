class Solution:
    def XXX(self, str: str) -> int:
        str = str.strip()
        if str == '':
            return 0
        
        k = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0']
        r = ''
        if str[0] in ['+', '-']:
            r += str[0]
            str = str[1:]
        
        for i in str:
            if i in k:
                r += i
            else:
                break
        
        if r in ['+', '-'] or r == '':
            return 0
        num = int(r)
        if num < -2147483648:
            return -2147483648
        if num >= 2147483648:
            return 2147483647
        return num

