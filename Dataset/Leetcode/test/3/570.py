 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        table = dict()
        
        slow = 0
        fast = 0
        ret_max = 0
        
        while slow<len(s) and fast<len(s):
          # find dup, slide window
          if s[fast] in table:
            del(table[s[slow]])
            slow+=1
          else:
            table[s[fast]] = fast
            fast+=1
            ret_max = max(ret_max,fast-slow)
            
        return ret_max

