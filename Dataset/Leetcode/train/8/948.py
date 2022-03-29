 class Solution(object):
    def XXX(self, str):
        """
        :type str: str
        :rtype: int
        """
        anstr = ""
        get   = False
        r     = False
        for i in str:
            if (not get) and i==' ':
                pass
            elif (not get) and i=='-':
                r     = True
                get   = True
                anstr = anstr+i
            elif (not get) and i=='+':
                get   = True
            elif i in ['0','1','2','3','4','5','6','7','8','9']:
                get   = True
                anstr = anstr+i;
            else : break
        if anstr in ["","-","+"]: return 0
        ans   = int(anstr)
        if ans<-2147483648:    return -2147483648
        elif ans>2147483647: return 2147483647
        else: return ans

