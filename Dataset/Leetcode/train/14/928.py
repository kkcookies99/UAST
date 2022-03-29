 class Solution:
    def XXX(self, strs: List[str]) -> str:
        for i in strs:
            if not i.isalnum():
                return ""
        l = []
        
        for i in strs:
            n = len(i)
            l.append(n)
        m = min(l)     #最短长度
        mm = l.index(m) #最短长度索引
        mmm = strs[mm]  #最短长度字符串
        strs.remove(mmm)  #移除最短字符串
        nn = len(strs)    #移除后列表长度
        l2 = []
        num = 0
        for j in range(m):
            for i in strs:
                if mmm[j] == i[j]:
                    num += 1
            if num == nn :
                l2.append(mmm[j])
                if j + 1 == m:
                    return ''.join(l2)
                else:
                    j += 1
                    num = 0
            elif len(l2) > 0:
                str1 = ''.join(l2)
                return str1
            else:
                return ""

