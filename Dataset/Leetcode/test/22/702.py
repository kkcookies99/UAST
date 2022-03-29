 class Solution:
    def XXX(self, n: int) -> List[str]:
        ans = [(0,0,'')]
        while True:
            t = []
            for a,b,s in ans:
                if a>0:t.append((a-1,b,s+')'))
                if b<n:t.append((a+1,b+1,s+'('))
            if t:ans = t
            else:break
        return list(map(lambda x:x[2],ans))

