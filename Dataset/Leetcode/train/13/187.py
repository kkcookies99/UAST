class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        maps = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        sp = {'IV':4, 'IX':9, 'XL':40, 'XC':90, 'CD':400, 'CM':900}

        res = 0
        i = 0
        while i < len(s)-1:    
            if sp.has_key(s[i]+s[i+1]):
                res += sp[s[i]+s[i+1]]
                i += 1
            else:
                res += maps[s[i]]
            i += 1
            
        if i == len(s) - 1:
            res += maps[s[-1]]
            
        return res

