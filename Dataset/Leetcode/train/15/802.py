 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums)<3: return []
        from collections import defaultdict
        counter=defaultdict(int)
        for i in range(len(nums)):
            counter[nums[i]]+=1
        result=set()
        from copy import copy
        a=sorted(nums)
        d=copy(a[::-1])
        anchor=None
        for i in range(len(a)):
            if a[i]==0:
                anchor=i
                break
        if anchor!=None:
            a=a[:anchor+1]
            d=d[:len(nums)-anchor]
        a2=copy(a)
        d2=copy(d)
        f=0
        while len(d)>0 and len(a)>0:
            _a=a[0]
            _d=d[f]
            _t=_a+_d
            added=False
            if (0-_t) in counter:
                counter[_a]-=1
                counter[_d]-=1
                counter[0-_t]-=1
                if counter[_a]>=0 and counter[_d]>=0 and counter[0-_t]>=0:
                    result.add(str(sorted([_a,0-_t,_d])))
                counter[_a]+=1
                counter[_d]+=1
                counter[0-_t]+=1
            if -_t>_d:
                a.pop(0)
                f=-1
            if _t>=0:
                d.pop(0)
                f-=1
            f+=1
        f=0
        while len(a2)>0 and len(d2)>0:
            _a=a2[f]
            _d=d2[0]
            _t=_a+_d
            added=False
            if (0-_t) in counter:
                counter[_a]-=1
                counter[_d]-=1
                counter[0-_t]-=1
                if counter[_a]>=0 and counter[_d]>=0 and counter[0-_t]>=0:
                    result.add(str(sorted([_a,0-_t,_d])))
                counter[_a]+=1
                counter[_d]+=1
                counter[0-_t]+=1
            if -_t<=_a:
                d2.pop(0)
                f=-1
            if _t<=0:
                a2.pop(0)
                f-=1
            f+=1
        return sorted([eval(i) for i in result])

