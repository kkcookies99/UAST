 class Solution:
    def XXX(self, s: str) -> bool:
        stack = list()
        if s[0]==')' or s[0]=='}' or s[0]==']':
            return False
        for i in s:
            if not stack:
                stack.append(i)
            else:
                if i==')':
                    if stack[-1]=='(':
                            stack.pop()
                    else:
                        stack.append(i)
                elif i=='}':
                    if stack[-1]=='{':
                            stack.pop()
                    else:
                        stack.append(i)
                elif i==']':
                    if stack[-1]=='[':
                            stack.pop()
                    else:
                        stack.append(i)
                else:
                    stack.append(i)
        if not stack:
            return True
        return False

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


