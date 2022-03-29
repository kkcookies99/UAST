class Solution:
    def XXX(self,x):
        first=0
        last=x-1
        mid=0
        found=False
        if x==0:
            return 0
        elif x==1:
            return 1
        else:
            while first<=last and not found:
                mid=(first+last)//2
                if mid**2<=x and (mid+1)**2>x:
                    found=True
                else:
                    if (mid+1)**2<=x:
                        first=mid+1
                    else:
                        last=mid-1
        return mid

