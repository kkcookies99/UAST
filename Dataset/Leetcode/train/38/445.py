 class Solution:
    def XXX(self, n: int) -> str:
        # 定义递归函数
        if n == 1:
            return '1'
        # 根据递归得到的XXX(n-1)字符做连续字符计数表示
        result = ''
        # 上个结果
        lastResult = self.XXX(n-1)
        length = len(lastResult)
        # 计算连续个数及字符
        i, j = 0, 0
        while j < length:
            # 走到不相同的字符位置为止
            if lastResult[i] != lastResult[j]:
                # 连续字符左右位置确定长度
                result += str(j - i)
                result += lastResult[i]
                # 转到下个不同的字符
                i = j
            # j继续前进
            j += 1
        # 收尾的连续字符记得补上
        result += str(j - i)
        result += lastResult[i]
        # 返回结果
        return result

