 class Solution:
    def XXX(self, s: str) -> int:
        str_map={}
        start=0
        end=0
        maxLen=1
        t1=0
        t2=0
        num = len(s)
        if(num>0):
            #初始化字典
            for i in range(num):
                str_map[s[i]]=-1
            #从1开始
            str_map[s[0]]=0
            for i in range(1,num):
                if(str_map[s[i]]!=-1 and str_map[s[i]]>=t1):
                    t1=str_map[s[i]] +1
                str_map[s[i]]=i
                t2=i
                if(t2-t1+1) > maxLen:
                    start = t1
                    end = t2
                    maxLen = (end-start +1)
            return maxLen
        else:
            return 0

