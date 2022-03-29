 class Solution:
    def XXX(self, s: str) -> int:
        list1 = []
        len_ = 0
        for i in s:
            if i in list1:
                if len_ < len(list1):
                    len_ = len(list1)
                list1 = list1[list1.index(i) + 1:]
            list1.append(i)
            if len_ < len(list1):
                len_ = len(list1)
        return len_


