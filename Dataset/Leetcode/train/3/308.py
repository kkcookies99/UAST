 class Solution:
    def XXX(self, s: str) -> int:
        L = []
        lenth = 0
        for i in s:
            #如果字符不在列表中，追加该字符并计算列表长度
            if i not in L:
                L.append(i)
            #如果字符在列表中，从字符所在位置切分列表
            else:
                idx = L.index(i)
                L = L[idx+1:]
                #切分之后将字符追加入列表
                L.append(i)
            current = len(L)
            lenth = max(current,lenth)
        return lenth

