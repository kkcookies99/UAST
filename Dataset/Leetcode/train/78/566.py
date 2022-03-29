 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        def back(head=[], tail=[]):
            if not tail:
                res.append(head)
                return
            back(head+tail[:1], tail[1:])
            back(head, tail[1:])
        back([], nums)
        return res        

