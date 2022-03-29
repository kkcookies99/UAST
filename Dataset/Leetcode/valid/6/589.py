 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        # 定义一个列表存储每行的拼接字符串
        new_chars = []

        # 判断有多少行子字符串
        for i in range(min(len(s), numRows)):
            new_chars.append('')

        raw = 0  # 行数
        is_transform = False  # 方向

        for i in range(len(s)):
            new_chars[raw] += s[i]
            if raw == 0 or raw == numRows - 1:
                is_transform = bool(1 - is_transform)  # 改变方向
            raw += 1 if is_transform else -1

        return ''.join(new_chars)

