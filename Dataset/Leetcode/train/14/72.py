 class Solution:
    def XXX(self, strs: List[str]) -> str:
        return strs and (s := max(strs)) and (p := min(strs)) and next((s[: i] for i, c in enumerate(p) if c != s[i]), p) or ''

