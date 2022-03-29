 class Solution:
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        end = ''
        n = len(s)
        # 针对只有一行时，其原序列即为新序列
        if numRows <= 1:
            return s
        # 依次遍历第i行
        for i in range(numRows):
            # 初始化每行第一个元素索引
            j = i
            while j < n:
                # 处理特殊行数。第一行和最后一行中间没有数，元素索引关系为
                # next = now + 2 * (numRows - 1)
                if i == 0 or i == numRows - 1:
                    end += s[j]
                    j += 2 * (numRows - 1)
                # 当行数不是第一行或最后一行时，中间会有一个数
                else:
                    # 首先读取第一个数
                    end += s[j]
                    # 计算出中间数的索引值，关系为：
                    # next = now + (numRows - i - 1) * 2
                    j += now + (numRows - i - 1) * 2
                    # 检测是否越界，若未越界，则添加到新字符串中
                    if j < n:
                        end += s[j]
                        # 计算中间数后的字符索引，关系为
                        # next = now + 2 * i
                        j += 2 * i
        return end

