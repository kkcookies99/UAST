 class Solution:
    def XXX(self, str: str) -> int:
        a = ''
        num_list = ['0','1','2','3','4','5','6','7','8','9']
        for c in str:
            if c != ' ':
                a = c
                break
        if a == '-' or a == '+':
            for c in str[str.index(a)+1:]:
                if c in num_list:
                    a += c
                else:
                    break
        elif a in num_list:
            for c in str[str.index(a)+1:]:
                if c in num_list:
                    a += c
                else:
                    break
        else:
            a = 0            
        if a == '-' or a == '+':
            return 0
        else:
            if int(a) >= -2147483648 and int(a)<= 2147483647:
                return int(a)
            elif int(a) < -2147483648:
                return -2147483648
            else:
                return 2147483647```

