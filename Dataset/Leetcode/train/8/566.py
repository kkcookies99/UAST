 class Solution:
    def XXX(self, s: str) -> int:
        return min(max(int(*re.findall(r"^[-+]?0*\d{1,11}", s.lstrip())), -2 ** 31), 2 ** 31 - 1)

