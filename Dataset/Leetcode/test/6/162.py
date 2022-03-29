 class Solution(object):
    # 思路：主要流程就是遍历字符串，将对应字符放到对应的行中。关键是要设置一个变量来控制向上还是向下放置。
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if not s: return None
        size = len(s)
        if size <= numRows or numRows == 1:
            return s
        res = [[] for _ in range(numRows)]
        cur_row = 0
        down = 0
        for ch in s:
            res[cur_row].append(ch)
            if cur_row == 0 or cur_row == numRows-1:
                down = 1 if not down else 0
            cur_row += 1 if down else -1
        ans = ""
        for item in res:
            ans += "".join(item)
        return ans

        

