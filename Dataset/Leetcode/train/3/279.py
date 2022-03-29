 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        list=[]
        list2=[0]
        for i in s:
            if i not in list:
                list.append(i)
                list2.append(len(list))
            else:
                list2.append(len(list))
                t=list.index(i)
                list = list[t+1:len(list)]
                list.append(i)
                continue
        return max(list2)

