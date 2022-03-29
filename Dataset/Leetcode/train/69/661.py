class Solution:
    def XXX(self, x: int) -> int:
        '''
            Solve f(a) = a^2 - x = 0
            f'(a) = 2a
            Line: y - (a^2-x) = 2a(x-a)
            x = (x - a^2)/2a + a = x/2a + a/2
        '''
        if x == 1:
            return 1
        mid = x //2
        while not (mid**2<=x and (mid+1)**2>x):
            mid = (x//mid + mid)//2
            
        return mid

