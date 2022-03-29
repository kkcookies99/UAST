 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if len(strs) == 0: return ""
        strs.sort()
        firLen = len(strs[0])
        lastLen = len(strs[-1])
        loopCnt = min(firLen, lastLen)

        ret = []
        for stridx in range(loopCnt):
            if strs[0][stridx] == strs[-1][stridx]:
                ret.append(strs[0][stridx])
            else:
                break;
        
        return "".join(ret)

