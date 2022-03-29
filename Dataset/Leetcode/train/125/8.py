 class Solution(object):
    def XXX(self, s):
        st = []
        for i in s:
            if i.isalpha():
                st.append(i.lower())
        return st == st[::-1]


