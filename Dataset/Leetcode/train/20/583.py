 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) % 2 != 0:
            return False

        _map = {
            '}': '{',
            ')': '(',
            ']': '[',
        }
        if _map.get(s[0]):
            return False

        lst = [s[0]]

        for _s in s[1:]:
            if not _map.get(_s):
                lst.append(_s)
                continue

            if not lst or lst.pop() != _map[_s]:
                return False

        if not lst:
            return True
        
        return False

