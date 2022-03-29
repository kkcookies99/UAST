 class Solution(object):
    def XXX(self, s):
        p=''
        for i in s:
            if i.isalpha():
                p+=i.lower()
        return p==p[::-1]

