class Solution:
    def XXX(self, height: List[int]) -> int:
        dscid =  sorted(range(len(height)),key = lambda i: height[i], reverse = True)
        cur_max = 0
        if dscid[0] < dscid[1]:
            pleft = dscid[0]
            pright = dscid[1]
        else:
            pleft = dscid[1]
            pright = dscid[0]
        pleft_ = pleft
        pright_ = pright
        cur_max = (pright - pleft)* min(height[pleft], height[pright])
        for idx in dscid[2:]:
            if idx < pleft:
                pleft = idx
            elif idx > pright:
                pright = idx
            else:
                continue
            temp = (pright - pleft)* min(height[pleft], height[pright])
            if temp > cur_max:
                cur_max = temp
        return cur_max

