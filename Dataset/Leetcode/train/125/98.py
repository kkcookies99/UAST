 class Solution:
    def XXX(self, s):
        if not s:
        	return False
        a = ''
        for i in s:
        	if i.isalnum():
        		a += i
        return a.lower() == a[::-1].lower()

