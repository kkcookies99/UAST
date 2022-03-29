 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0:
            return ''
        num = min([len(e) for e in strs])
        dst = []
        for i in range(num):
            cur = [e[i] for e in strs]
            if len(set(cur)) == 1:
                dst.append(cur[0])
            else:
                break
        return ''.join(dst)

