 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        mmap=dict()
        p_list=list()
        n_list=list()
        for item in nums:
            mmap.setdefault(item,0)
            mmap[item]+=1
            if item >0 and item not in p_list:
                p_list.append(item)
            elif item <0 and item not in n_list:
                n_list.append(item)
            
        res=list()
        if 0 in mmap and mmap[0]>=3:
            res.append([0,0,0])
        if 0 in nums:
            for item in mmap.keys():
                if item <0 and -item in mmap:
                    res.append([0,item,-item])
        for item in mmap.keys():
            if item==0:
                continue
            if mmap[item]>=2 and (-item*2) in mmap:
                res.append([item,item,-item*2])
        i=0
        while i<len(p_list):
            j=i+1
            while j<len(p_list):
                if (-p_list[i]-p_list[j]) in mmap:
                    res.append([p_list[i],p_list[j],-p_list[i]-p_list[j]])
                j+=1
            i+=1
        i=0
        while i<len(n_list):
            j=i+1
            while j<len(n_list):
                if (-n_list[i]-n_list[j]) in mmap:
                    res.append([n_list[i],n_list[j],-n_list[i]-n_list[j]])
                j+=1
            i+=1
            
        return res

