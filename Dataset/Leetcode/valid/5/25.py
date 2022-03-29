 class Solution:
    def XXX(self, s: str) -> str:
        n = len(s)

        # 特解
        if n < 2:
            return s

        '''
        创建动归表dp (n x n的全为False的矩阵) 用来表示字符串s的每一个子串是否为回文
        s子串个数 = n + n-1 + ... + 1, e.g. 字符串babad有5 + 4 + 3 + 2 + 1 = 15种子串
        start用来跟踪最长回文子串的起点, max_len代表最长回文子串的长度
        '''
        dp = [[False] * n for _ in range(n)]
        start, max_len = 0, 1

        '''
        如果字符串是babad
        下面的双循环则进行以下遍历 (遍历所有可能的15个子字符串):
        b
        ba,    a
        bab,   ab,   b,
        baba,  aba,  ba,  a
        babad, abad, bad, ad, d

        dp[left][right]代表s被left和right指针相夹而得的子字符串
        e.g. left = 0, right = 3, dp[left][right] = baba
        '''
        for right in range(n):
            for left in range(0, right + 1):
                '''
                (0) 求子串跨越长度span
                (1) 边缘情况1: 子串长度为1, 则一定是回文
                (2) 边缘情况2: 子串长度为2, 如果俩字符相同则是回文
                (3) 非边缘情况则进行动态规划之状态转移: 如果b是回文, aba也一定是回文
                    即判断是否为回文需同时满足两条件: 
                        1. 剥离左右最外层字符后的子字符串是回文 
                        2. 最外层的字符相同
                '''
                span = right - left + 1
                if span == 1:
                    dp[left][right] = True
                elif span == 2:
                    dp[left][right] = s[left] == s[right]
                else:
                    dp[left][right] = dp[left + 1][right-1] and s[left] == s[right]

                # 若新的回文出现, 判断是否需要更新最大长度
                if dp[left][right]:
                    if span > max_len:
                        max_len = span
                        start = left
        # 返回最长回文子串
        return s[start:start + max_len]

