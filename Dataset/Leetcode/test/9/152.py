class Solution(object):
    def XXX(self,x):
        if x<0:return False
        stk=[]
        cnt=0
        while pow(10,cnt)<=x:
            cnt+=1
            cur=(x % pow(10,cnt))//pow(10,cnt-1)
            stk.append(cur)
        while stk!=[] and len(stk)!=1:
            if stk[0]==stk[-1]:
                stk.pop(0)
                stk.pop()
                continue
            return False
        return True
        
if __name__=='__main__':

    x=123321

    sl=Solution()

    print(sl.XXX(x))

