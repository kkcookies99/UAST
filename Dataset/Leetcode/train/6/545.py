 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        from collections import defaultdict
        res = ''
        tmp = defaultdict(list)
        if len(s) <= 0 or numRows < 1:
            return res
        if numRows == 1:
            return s
        for i in range(0, len(s)):
            ans = i // (numRows-1)  # 取整     把字符串按照 (numRows-1) 个数分割成N组， 偶数组顺序，奇数组倒叙排列  第0组(0组) 第1组 第2组
            cur = i % (numRows-1)   # 取余
            # print(ans, cur)
            if ans % 2 == 0:  # 结果为偶数或0
                tmp[cur].append(s[i]) # 按余数正序保存
            if ans % 2 != 0:  # 结果为奇数
                tmp[numRows-cur-1].append(s[i])  # 按余数倒叙保存
        # print(tmp)
        for j in range(0, len(tmp)):
            res = res + ''.join(tmp[j])
        return res


