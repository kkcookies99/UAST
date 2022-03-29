 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) <= 1:
            return True

        p = 0
        q = len(s) - 1
        while p <= q:
            s1 = s[p:p+1].lower()
            if not s1.isalnum():
                p = p + 1
                continue

            s2 = s[q:q+1].lower()
            if not s2.isalnum():
                q = q - 1
                continue

            if s1 != s2:
                return False

            p = p + 1
            q = q - 1

        return True

