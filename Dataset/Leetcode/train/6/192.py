 class Solution:

    def XXX(self, s: str, numRows: int) -> str:
        # 判断特殊条件
        if numRows == 1 or  len(s) <= numRows:
            return s

        n, i, flag, reverse, res_dic = len(s), 0, 0, 1, {}
        """
        指定阈值，进行Z字形下标的遍历，如当numRows=3,s="technology"时，
        flag(对应的行数)的值为：
        0 1 2 1 0 1 2 1 0 1
        t e c h n o l o g y
        """
        threshold = numRows - 1
        while i < n:
            # 将相同行数的字符进行拼接
            if flag not in res_dic:
                res_dic[flag] = s[i]
            else:
                res_dic[flag] += s[i]

            # 当flag等于阈值时，flag的变化为递减，当flag等于0时，flag的变化为递增
            if flag == 0:
                reverse = 1
            if flag == threshold:
                reverse = 0

            if reverse == 1:
                flag += 1
            else:
                flag -= 1

            i += 1

        print(res_dic)
        res_str = ""
        # 拼接每一行的字符串
        for res in res_dic:
            res_str += res_dic[res]

        return res_str


