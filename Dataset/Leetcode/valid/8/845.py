 class Solution(object):
    def XXX(self, str):
        import re
        regex = r"^\s*[\-\+]?\d+"
        res = 0
        matches = re.match(regex, str, re.MULTILINE)
        if matches: res = int(matches.group())
        res = [res, 2**31 - 1][res > 2**31 - 1]
        res = [res, -2**31][res < -2**31]
        return res

