 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 1:
            return ["()"]
        lst = []
        for i in self.XXX(n-1):
            lst.append('('+i+')')
            lst.append("()"+i)
            if i+'()' not in lst:
                lst.append(i+'()')
        return lst

