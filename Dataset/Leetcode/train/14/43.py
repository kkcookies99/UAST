 class Solution:
    def XXX(self, strs: List[str]) -> str:
        result = ""
        if len(strs) == 0:
            return result
        # 取出最短的字符串
        flag_str = min(strs, key=len)
        # 原始列表中去除这个，避免自己和自己判断
        strs.remove(flag_str)
        # 循环每一个最短字符串的字符，与列表的其他字符串进行比较
        for i, each_char in enumerate(flag_str):
            for each in strs:
            	# 只要发现不等就马上退出
                if each[i] != each_char:
                    return result
            result += each_char
        return result

