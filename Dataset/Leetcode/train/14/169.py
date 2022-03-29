 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        # 先找到列表中最小长度的一个单词，以它为模板循环切片，循环判断其他单词是否以该单词部分为前缀。
        # 如果列表中只有一个元素，直接返回
        if len(strs) == 1:
            return strs[0]
        # 拿到列表单词的最小长度
        min_len = min([len(i) for i in strs])
        # 拿到列表中为最小长度的第一个单词。
        for i in strs:
            if len(i) == min_len:
                min_len_str = i
                break
        # 以最小长度为范围，
        for v in range(min_len , 0, -1):
            # 遍历列表中每个单词是否以最小长度单词的部分为前缀
            if all([i.startswith(min_len_str[:v]) for i in strs]):
                return min_len_str[:v]
        return ''

