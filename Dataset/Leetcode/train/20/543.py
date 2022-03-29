 class Solution(object):
    
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        def match(ch1, ch2):
            if ch1 == '(' and ch2 == ')': return True
            if ch1 == '{' and ch2 == '}': return True 
            if ch1 == '[' and ch2 == ']': return True
            return False

        n = len(s)
        q, ans = [], True 
        for ch in s:
            # 遇到左括号就进栈
            if ch == '(' or ch=='{' or ch == '[':
                q.append(ch)
            else:
                # 遇到右括号，栈空或栈顶元素不匹配，括号匹配失败
                if len(q)==0 or match(q[-1], ch) == False:
                    ans = False 
                    break 
                else:
                    # 配对成功，弹出站顶元素
                    q.pop()
        # 栈顶还有剩余元素，说明有多余的左括号未匹配
        if len(q) != 0:
            ans = False 
        return ans 

