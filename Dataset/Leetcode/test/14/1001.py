 class Solution:
    def XXX(self, strs: List[str]) -> str:        
        return ''.join(i[0] for i in takewhile(lambda t: len(set(t))==1,zip(*strs)))

