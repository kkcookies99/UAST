 class Solution:
    def XXX(self, n):
        ans=""
        d=['1']
        if n<1:
            return d[n-1]
        d=d[0:n-1]
        for i in range(1,n):
            du=""
            s=d[i-1]
            
            count=1
            cur=s[0]
            
            for j in s[1:]:
                if j==cur:
                    count+=1
                else:
                    du=du+str(count)+str(cur)
                    count=1
                    cur=j
            du=du+str(count)+str(cur)
            d.append(du)
        
        print(d)
        return du

