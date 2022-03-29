 class Solution:
    
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()        
        n0=0
        fdic,zdic={},{}
        flist,zlist=[],[]
        for num in nums:
            if num<0:
                if -num in fdic:
                    fdic[-num]+=1
                else:
                    fdic[-num]=1
                
            elif num==0:
                n0+=1           
                
            else:
                if num in zdic:
                    zdic[num]+=1
                else:
                    zdic[num]=1

        flist=list(fdic.keys())
        zlist=list(zdic.keys())
        
        se=set()


        if n0>2:
            se.add((0,0,0))   
        if n0:
            for n in flist:
                if n in zlist:
                    se.add((-n,0,n))   
        

        for i in range(0,len(flist)):
            for j in range(i,len(flist)):                
                if (i==j and fdic[flist[i]]>1 and flist[i]+flist[j] in zlist):
                    se.add((-flist[i],-flist[j],flist[i]+flist[j])) 
                elif i!=j and flist[i]+flist[j] in zlist:
                    se.add((-flist[i],-flist[j],flist[i]+flist[j])) 


        for i in range(0,len(zlist)):
            for j in range(i,len(zlist)):                
                if (i==j and zdic[zlist[i]]>1 and zlist[i]+zlist[j] in flist):
                    
                    se.add((-zlist[i]-zlist[j],zlist[i],zlist[j])) 
                elif i!=j and zlist[i]+zlist[j] in flist:                    
                    se.add((-zlist[i]-zlist[j],zlist[i],zlist[j])) 

        return list(se)

