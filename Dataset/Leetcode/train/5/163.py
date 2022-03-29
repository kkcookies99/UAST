 def judge(self, m: str) -> bool:
    for i in range(len(m) // 2):
        x = m[i]
        y = m[-(i + 1)]
        if x != y:
            return False
    return True


def XXX(self, s: str) -> str:
    if not s:
        return ''
    if len(s) == 1:
        return s
    result = ''
    ts = ''
    for i in s:
        ts = i + ts
    for i in range(len(s)):
        for j in range(len(ts)):
            tmp = ''
            if s[i] == ts[j]:
                for x in range(i, len(s)-j):
                    tmp += s[x]
            if self.judge(tmp) and len(tmp) > len(result):
                result = tmp
    return result
