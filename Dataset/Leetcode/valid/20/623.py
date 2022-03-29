 class Solution:
    def XXX(self, s: str) -> bool:
        '''
        if not s or len(s)%2 == 1:
            return False
        # 循环删除成对的括号 ，如果最后字符串为''，说明是有效的
        while '{}' in s or '[]' in s or '()' in s:
            s = s.replace('{}', '')
            s = s.replace('[]', '')
            s = s.replace('()', '')
        return s == ''
        '''
        # 将遇到的左括号存入栈中
        # 当遇到右括号时，如果栈顶元素与当前括号是成对的，栈顶元素出栈，否则直接返回false
        stack = list()
        for c in s:
            if c in '([{':
                stack.append(c)
            else:
                if stack:                
                    left_c = stack.pop()
                    if left_c + c == '()' or left_c + c == '[]'or left_c + c == '{}':
                        continue
                    else:
                        return False
                else:
                    return False
        return not stack

