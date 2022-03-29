 class Solution:
    def XXX(self, strs: List[str]) -> str:
        pre_fix = strs.pop(0)
        while strs:
            s = strs.pop(0)
            while pre_fix:
                if s.startswith(pre_fix):
                    break
                else:
                    pre_fix = pre_fix[:len(pre_fix)-1]
        return pre_fix

            


