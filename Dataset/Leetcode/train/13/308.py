class Solution:
    def XXX(self, s: str) -> int:
        number_dict = {
        'I':1,
        'V':5,
        'X':10,
        'L':50,
        'C':100,
        'D':500,
        'M':1000,
        # 特殊情况
        'IV':4,
        'IX':9,
        'XL':40,
        'XC':90,
        'CD':400,
        'CM':900
        }
        result = 0
        i = 0 #循环变量
        while i<len(s):
            # 每次先匹配两个字符,如果不匹配则只匹配一个字符
            if number_dict.get(s[i:i+2]) is not None:
                result += number_dict.get(s[i:i+2])
                i += 2
            else:
                result += number_dict.get(s[i])
                i += 1
        return result

