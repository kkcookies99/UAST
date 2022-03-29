class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x==0 :return 0
        l=1
        r=x
        while l<=r:

            mid=int((l+r)/2)
            sqrt=int(x/mid)
            if sqrt==mid:
                return mid
            elif sqrt>mid:
                l=mid+1
            else :
                r=mid-1
        return r


