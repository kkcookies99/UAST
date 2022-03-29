 class Solution:
    def XXX(self, n: int) -> List[str]:
        if not n :
            return []
        q = deque()
        q.append('()')
        for i in range(1, n):
            l = len(q)
            for t in range(l):
                t = q.popleft()
                q.append('(%s)' %t)
                q.append('()%s' %t)
                q.append('%s()' %t)
        return list(set(i for i in q))

