 class Solution:
    def XXX(self, s: str) -> bool:
        filtered = list(filter(lambda x: x.isalnum(), list(s.lower())))
        return filtered == filtered[::-1]

