class Solution:
    def XXX(self, s):
        a = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        Sum_s = 0
        for i in range(len(s)-1):
            if a[s[i]] >= a[s[i+1]]:
                Sum_s += a[s[i]]
            else:
                Sum_s -= a[s[i]]
        return Sum_s + a[s[-1]]

