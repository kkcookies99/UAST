 class Solution:
    def XXX(self, s: str) -> int:
        occ = set()
        n, i, res = len(s), 0, 0
        for j in range(n):
            if s[j] in occ:
                k = s.index(s[j],i)     #找到列表中重复字符第一次出现的位置k
                occ -= set(s[i:k+1])    #删除集合中k位置及左边出现的所有字符
                i = k + 1               #左指针移至k位置右边一位
            occ.add(s[j])               #记录字符
            res = max(len(occ),res)
        return res

