class Solution:
    def XXX(self, a: str, b: str) -> str:
        a, b = list(a), list(b)
        max_len = max(len(a), len(b))
        add_one = False
        sums = []
        while True:
            res = 0
            if add_one:
                res = 1
                add_one = False
            res += int(a.pop() if a else 0)
            if res == 2:
                add_one = True
                res = 0
            res += int(b.pop() if b else 0)
            if res == 2:
                add_one = True
                res = 0
            sums.insert(0, str(res))
            if len(sums) >= max_len and not add_one:
                break
        return ''.join(sums)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


