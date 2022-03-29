 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        dict = {}
        for i in s:
            dict.setdefault(i,0)
            dict[i]= dict.get(i) + 1

        if dict.get("(") != dict.get(")") or dict.get("{") != dict.get("}") or dict.get("[") != dict.get("]"):
            return False

        if "()" in s or "[]" in s or"{}" in s or "" == s:
            for i in range(len(s)):
                s = s.replace("[]", "")
                s = s.replace("()", "")
                s = s.replace("{}", "")
                s = s.replace("1", "")
            if "" == s:
                return True
            return False
        else:
            return False

