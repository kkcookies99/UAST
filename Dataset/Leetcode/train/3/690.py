 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        # 算法思路  滑动窗口
        n = len(s)
        # rk为右指针
        rk, res = 0, 0
        for i in range(n):
            occ = set()
            rk = i 
            while rk < n and s[rk] not in occ:
                occ.add(s[rk])
                rk += 1
            res = max(len(occ),res)

        return res

