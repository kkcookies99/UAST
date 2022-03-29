 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        dic={}
        for num in nums:
            if num not in dic:
                dic[num]=0
            dic[num]+=1
        if 0 in dic and dic[0]>2:
            res=[[0,0,0]]
        else:
            res=[]
        positive_num=[p for p in dic if p>0]
        negative_num=[n for n in dic if n<0]
        for p in positive_num:
            for n in negative_num:
                inverse=-(p+n)
                if inverse in dic:
                    if inverse==p and dic[p]>1:
                        res.append([p,n,inverse])
                    elif inverse==n and dic[n]>1:
                        res.append([p,n,inverse])
                    elif inverse>p or  inverse<n or inverse==0:
                        res.append([p,n,inverse])
        return res

