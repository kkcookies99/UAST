class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n==1:
            return "1"
        elif n==2:
            return "11"
        else:
            next_li=str(11)
            for i in range(n-2):
                long=len(next_li)
                left=0
                right=1
                counts=1
                tmp=0
                now=""
                while right<long:
                    while right<long and next_li[left] == next_li[right]:
                        tmp = next_li[left]
                        right+=1
                        counts+=1
                    else:
                        if right<long:
                            now += (str(counts)+str(next_li[left]))
                            left,right = right,right+1
                            tmp=next_li[left]
                            counts=1
                now += (str(counts)+str(tmp))
                next_li=now
        return next_li

