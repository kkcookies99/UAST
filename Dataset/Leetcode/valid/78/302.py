class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        final = list()
        # ----------------------------------------------------
        if len(nums)==1:
            return [[],nums]
        if len(nums)==0:
            return []
        # ------------------------------------------------------
        def pop(cut):
            if not cut:
                return 
            else:
                for i in range(len(cut)):
                    tmp = copy.deepcopy(cut)
                    tmp.pop(i)
                    if tmp not in final:
                        final.append(tmp)
                        pop(tmp)
        pop(nums)
        if nums:
            final.append(nums)
        return final

