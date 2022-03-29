 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if not strs: return ''
        s_min, s_max = min(strs), max(strs)
        for i, c in enumerate(s_min):
            if c != s_max[i]:
                return s_min[:i]
        return s_min

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

