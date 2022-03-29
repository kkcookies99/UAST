 class Solution:
    def XXX(self, str: str) -> int:
        if len(str) == 0 :
            return 0
        result = ''
        for i in range(len(str)):
            if len(str[i:]) == 0:
                return 0
            elif str[i] == ' ' and i == len(str)-1:
                return 0
            elif str[i] == ' ':
                continue
            elif str[i] == '+' or str[i] == '-':
                result += str[i]
                i += 1
                break
            elif str[i].isnumeric():
                break
            elif str[i].isalpha():
                return 0
            else:
                return 0
        if i == len(str):
            return 0
        for j in range(i, len(str)):
            if str[j].isnumeric() == False and j == i:
                return 0
            elif str[j].isnumeric():
                result += str[j]
            else:
                break
        if int(result) > 2**31-1:
            return 2**31-1
        elif int(result) < -2**31:
            return -2**31
        
        return int(result)

