 class Solution:
    def XXX(self, str):
        result=''
        fuhao=''
        str = str.strip(' ')
        a = ['1','2','3','4','5','6','7','8','9','0']
        b = ['+','-']
        if len(str)==0:
            return 0
        if str[0] in b:
            fuhao = str[0]
            str = str[1:]
        result += fuhao
        for i in str:
            if i in a:
                result += i
            else:
                break
        try:
            result = int(result)
            if result<(-2**31): 
                return -2**31
            elif result>(2**31-1):
                return 2**31-1
            else:
                return result
        except:
            return 0

