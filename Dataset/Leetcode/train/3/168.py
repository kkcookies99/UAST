 class Solution:
def XXX(self, s: str) -> int:
    length = 0
    s_list = list()
    for c in s:
        if c not in s_list:
            s_list.append(c)
            if len(s_list) > length:
                length = len(s_list)
        else:
            if len(s_list) > length:
                length = len(s_list)
            idx = s_list.index(c)
            s_list = s_list[idx:]
            s_list.pop(0)
            s_list.append(c)
    return length
