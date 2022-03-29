class Solution:
    def XXX(self, s: str) -> int:
        s_list = s.split(' ')
        index = len(s_list)-1
        while index>=0:
            if len(s_list[index])>0:
                return len(s_list[index])
            else:
                index-=1
        return 0

