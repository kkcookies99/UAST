 class Solution:
    def XXX(self, s: str) -> bool:
        ans = "~`!@#$%^&*():,.\"\"/?[]{|\/<>;=+-_'\}"
        i, n, res = 0, len(s), ""
        while i < n:
            if s[i] in ans or s[i] == " ":
                i += 1
                continue
            res = res + s[i].lower()
            i += 1
        index = len(res) // 2
        if len(res) % 2 != 0:
            return res[:index][::-1] == res[index+1:]
        else:
            return res[:index][::-1] == res[index:]

