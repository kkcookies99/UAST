 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        
        def get_(result,left,right,prifix):
            if left<0 or right<0:
                return
            if right<left:
                return
            if left==0 and right==0:
                result.append(prifix)
                return
            else:
                get_(result,left-1,right,prifix+'(')
                get_(result,left,right-1,prifix+')')
        get_(result,n,n,'')
        return result

