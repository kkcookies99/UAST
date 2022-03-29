def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        left, right = 0, 0
        while right < len(s):
            right += 1
            if len(set(s[left:right])) != right-left:
                left += 1
            
        return right-left

