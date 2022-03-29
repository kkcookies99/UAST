 class Solution:
    def XXX(self, s: str) -> bool:
        #解法一，就图一乐，面试的时候写这个就大型社死。
        while '{}' in s or '()' in s or '[]' in s:
            s = s.replace('{}','')
            s = s.replace('()','')
            s = s.replace('[]','')
        return s == ''

        #解法二，栈
        dict = {']':'[',')':'(','}':'{'}
        res = []
        for i in s:
            if i in {'[','(','{'}:
                res.append(i)
            else:s
                if not res:
                    return False
                elif res[-1] == dict[i]:
                    res.pop()
                else:
                    return False
        if not res:
            return True
        else:
            return False

