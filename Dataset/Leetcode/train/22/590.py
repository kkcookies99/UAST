 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n==0: return []
        if n==1: return ["()"]
        r=[set() for i in range(n)]
        r[0].add("()")
        for i in range(1,n):
            for j in range(i-1):
                for p in r[j]:
                    for q in r[i-j-1]:
                        r[i].add(p+q)
                        r[i].add(q+p)
            for p in r[i-1]:
                r[i].add("()"+p)
                r[i].add(f"({p})")
                r[i].add(p+"()")
        return sorted(r[-1])

