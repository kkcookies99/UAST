 class Solution:
    def XXX(self, strs: List[str]) -> str:
        self.l = len(strs)
        self.min_str = min(strs, key=lambda x:len(x))
        self.strs = strs
        self.strs.remove(self.min_str )
        return self.find(self.min_str )

    def find(self, les):
        count = 1
        for s in self.strs:
            if s.startswith(les):
                count += 1
        if count == self.l:
            return les
        elif len(les) > 0:
            return self.find(les[:-1])
        else:
            return ""

