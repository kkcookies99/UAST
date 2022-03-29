 class Solution:
    def XXX(self, s: str) -> bool:
        st = []
        for c in s:
            if c == ')':
                if not st or st.pop() != '(':
                    return False
            elif c == ']':
                if not st or st.pop() != '[':
                    return False
            elif c == '}':
                if not st or st.pop() != '{':
                    return False                                
            else:
                st.append(c)
        return not st

