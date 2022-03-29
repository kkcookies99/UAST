 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        # 判断是否为空
        if not strs:
            return ''
        # 在使用max和min的时候已经把字符串比较了一遍
        # 当前列表的字符串中，每个字符串从第一个字母往后比较直至出现ASCII码 最小的字符串
        s1 = min(strs)
        # 当前列表的字符串中，每个字符串从第一个字母往后比较直至出现ASCII码 最大的字符串
        s2 = max(strs)
        # 使用枚举变量s1字符串的每个字母和下标
        for i, c in enumerate(s1):
            # 比较是否相同的字符串，不相同则使用下标截取字符串
            if c != s2[i]:
                return s1[:i]
        return s1



