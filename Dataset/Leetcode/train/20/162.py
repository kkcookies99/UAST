 class Solution:
    def XXX(self, s: str) -> bool:
        stk = []
        pair={')':'(',']':'[','}':'{'}
        for c in s:
            if c in '([{':
                stk.append(c)
            elif not stk or pair[c]!=stk[-1]:
                return False
            else:
                stk.pop()
        return stk==[]
    ```
undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

