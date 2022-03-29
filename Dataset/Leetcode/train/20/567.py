 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """

        # 定义字典存储括号对
        dictstr = {"{" : "}", "[" : "]", "(" : ")"}
        # 定义stack存储数据
        stack = []

        for i in s:
            if i in dictstr.keys():
                stack.append(i)
            elif len(stack) == 0 or dictstr[stack.pop()] != i:
                return False

        # 当字符串为 "[" 或 "{["等情况时
        if len(stack) != 0:
            return False
        else:
            return True

