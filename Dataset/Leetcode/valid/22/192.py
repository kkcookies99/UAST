 class Solution:
    def XXX(self, n: int):
        def check(s):
            stk=[]
            for c in s:
                if c=='(':
                    stk.append(c)
                else:
                    if len(stk)==0:
                        return False
                    stk.pop()
            return len(stk)==0
        ans=[]
        def make(rec,cur):
            if cur>0 or cur<-n:
                return
            if len(rec)==2*n:
                if check(rec):
                    ans.append(''.join(rec))
                return
            rec.append('(')
            make(rec,cur-1)
            rec.pop()
            rec.append(')')
            make(rec,cur+1)
            rec.pop()
        make([],0)
        return ans

