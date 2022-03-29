 class Solution(object):
    def XXX(self, s):
        mylist = []
        myset = {'(':')','[':']','{':'}'}
        for par in s:
            if par in myset:
                mylist.append(par)
            else:
                if mylist != [] and myset[mylist.pop()] == par:
                    continue
                else:
                    return False
        return False if mylist else True

