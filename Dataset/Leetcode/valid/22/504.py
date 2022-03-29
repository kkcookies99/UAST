 class Solution:
    def XXX(self, n: int) -> list[str]:
        import copy
        res = []
        p = {"(":n,")":n}
        def trackback(p:dict):
            if sum(p.values()) == 0 and "".join(track) not in res:
                res.append("".join(track))
                return
            else:
                for i in list(p.keys()):
                    if p[i] == 0:
                        continue
                    p[i] -= 1
                    if i == ")":
                        if track.count("(") <= track.count(")"):
                            p[i] += 1
                            return
                    track.append(i)
                    trackback(p)
                    track.pop()
                    p[i] += 1

        track = list()
        trackback(p)
        return res

