 class Solution:
    def XXX(self, s: str) -> bool:
        if s == "":
            return True
        import re
        regex = re.compile("[^a-zA-Z0-9]")
        s = s.lower() # 先转换成小写
        ss = regex.sub("", s)
        print(ss)
        i, j = 0, len(ss)-1
        while i < j:
            if ss[i] != ss[j]:
                return False
            i += 1; j -= 1
        return True

