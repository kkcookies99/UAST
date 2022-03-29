 class Solution:
    def XXX(self, strs: List[str]) -> str:
        # 初始化最小长度字符串和最小长度
        min_len_str = strs[0]
        min_len = 200
        # 公共前缀
        pub_str = ''
        # 找最小字符串
        for s in strs:
            if len(s) < min_len:
                min_len = len(s)
                min_len_str = s
        # 计算公共前缀
        for i in range(min_len):
            if all(s.startswith(min_len_str[0:i+1]) for s in strs):
                pub_str = min_len_str[0:i+1]
            else:
                break
        return pub_str

