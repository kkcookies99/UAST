 class Solution:
    def XXX(self, n: int) -> List[str]:
        def com(s,ll,lr):
            reli=[]
            if ll==0:
                reli.append(s+''.join([')' for i in range(lr)]))
            elif lr!=0:
                reli+=com(s+'(',ll-1,lr)
                if  ll<lr:
                    reli+=com(s+')',ll,lr-1)
            return reli
        return com('',n,n)

