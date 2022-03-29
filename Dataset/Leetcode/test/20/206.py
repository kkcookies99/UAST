 class Solution:
    def XXX(self, s):
        while "()" in s or "[]" in s or "{}" in s:
            s = s.replace('[]','').replace('()','').replace('{}','')
        return len(s) == 0

