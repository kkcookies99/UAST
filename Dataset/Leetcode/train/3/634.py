 class Solution:
    def XXX(self, s: str) -> int:
        n = len(s)
        left, right = 0, 0
        ans = 0
        myset = set()
        while right < n:
            if s[right] not in myset:
                myset.add(s[right])
                right += 1
                ans = max(right - left, ans)
            else:
                while left < right and s[right] in myset:
                    myset.remove(s[left])
                    left += 1
        return ans
            

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


