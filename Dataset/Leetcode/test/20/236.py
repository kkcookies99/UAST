 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # 算法思想：
        # 首先，要知道的是，这是一个栈的问题；
        # 如果栈内元素为空，那么元素入栈，不做判断；
        # 如果栈不为空，那么首先判断当前元素是否为字典的key（反括号），
        # 是的话，则查找它的key是否等于栈顶元素，不是的话，直接返回False;
        # 如果当前元素不为字典的key,那么添加的栈里面去；
        # 最终for循环结束后，如果栈为空返回True，如果栈不为空，返回False.
        mapping = {"}":"{","]":"[",")":"("}
        stack = []
        for char in s:
            if len(stack) > 0:
                if char in mapping:
                    if mapping[char] != stack.pop():
                        return False
                else:
                    stack.append(char)
            else:
                stack.append(char)
        return not stack

