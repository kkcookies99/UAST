 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """

        s = s.lower()
        lef = 0
        rig = len(s)-1
        while lef < rig:
            while not s[lef].isalpha() and not s[lef].isalnum() and lef < rig:
                lef += 1
            while not s[rig].isalpha() and not s[rig].isalnum() and lef < rig:
                rig -= 1
            if s[lef] == s[rig]:
                lef += 1
                rig -= 1
            else:
                return False
        return True

