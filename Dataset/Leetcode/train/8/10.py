class Solution:
    def XXX(self, s: str) -> int:
        #去除左边的空格
        s = s.lstrip()
        if len(s) == 0:
            return 0
        #读入符号
        if s[0] == '-':
            result = [""]
            result += '-0'
            s = s[1:len(s)]
        elif s[0] == '+':
            result = [""]
            result += '+0'
            s = s[1:len(s)]
        else:
            #加0，是为了防止没有数字时，return int(result)会报错
            result = ["0"]
        for i,s_1 in enumerate(s):
            if s_1.isalpha() or s_1 == '.':
                break
            elif s_1 == "+" or s_1 == "-" or s_1 == " ":
                break
            elif s_1.isdigit():
                result += s_1
        result = int("".join(result))
        if result<((-2)**31):
            result = (-2)**31
        elif result>((2**31) - 1) :
            result = (2**31)-1
        return result

