 class Solution:
    def XXX(self, strs: List[str]) -> str:
        st = ''
        for i in range(len(strs[0])):
            try:
                st_lst = list(set([str_st[i] for str_st in strs]))
                if len(st_lst) == 1:
                    st = st + st_lst[0]
                else:
                    return st
            except:
                return st
        return st

