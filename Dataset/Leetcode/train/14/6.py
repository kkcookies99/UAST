class Solution:
    def XXX(self, strs: List[str]) -> str:
        min_len = 999999
        # 1.求出各个字符串的长度，求最小值，限制公共前缀的大小
        # 2.同公共前缀进行遍历，记录index
        for i in range(len(strs)):
            min_len = min(min_len, len(strs[i]))
        index = -1
        flag = True  # 可以往更长的前缀试试
        for i in range(min_len):
            s1 = strs[0][:i + 1]
            for j in range(len(strs)):
                if s1 != strs[j][:i + 1]:
                    flag = False
                    break
            if not flag:
                break
            else:
                index = i + 1
        if index == -1:
            return ""
        else:
            return strs[0][:index]

