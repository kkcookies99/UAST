 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        valid_chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'
        res_list = []
        for char in s:
            if char in valid_chars:
                res_list.append(char.upper())
        return res_list == res_list[::-1]
        
        


