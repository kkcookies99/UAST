 class Solution(object):
    @classmethod
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        val = str(1)
        def trans(val, cnt):
            if cnt == n:
                return val
            left =0
            right =0
            nextval= ""
            val = val+"$"
            while left!=len(val)-1 or right!=len(val)-1:
                if val[left]==val[right]:
                    right+=1
                else:
                    nextval ="".join([nextval,str(right-left),val[left]])
                    left=right;
            cnt+=1
            return trans(nextval,cnt)
        ret = trans(val, 1)
        return ret

