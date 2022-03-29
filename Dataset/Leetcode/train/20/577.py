 class Solution:
    def XXX(self, s: str) -> bool:
        # 栈用于存储左括号
        stack = []
        
        for char in s:
            if char in '([{': 
                # 如果是左括号，压入
                stack.append(char)  
            else:
                # 如果是右括号，栈空（无左括号），或左右不匹配，则无效
                if not stack or '([{'.find(stack.pop()) != ')]}'.find(char): return False
        
        # 如果最后栈空则括号有效，否则栈中还有左括号，即无效
        return True if not stack else False

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


