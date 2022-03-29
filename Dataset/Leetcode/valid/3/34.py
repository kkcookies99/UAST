 class Solution:
    def XXX(self, s: str) -> int:
        n = len(s)
        rk = 0
        # occ用于存储字符串，res用于存储一轮中的字符串长度
        res, occ = [], []
        # 基本思想：找到所有的不重复子串，返回最大的子串长度
        # 开始时指针位置指向头，遍历一遍s,若列表中不存在该字符串，则添加进列表，
        # 只要发现列表中存在该字符串，则记载此时的列表长度，并将列表置空
        # 并且需要将指针从第二个字符串处开始重复遍历s
        for i in range(n):
            while rk < n and s[rk] not in occ:
                occ.append(s[rk])
                rk += 1
            res.append(len(occ))
            occ = []
            rk = i
        return 0 if res == [] else max(res)

