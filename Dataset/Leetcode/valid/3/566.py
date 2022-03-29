 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s)==0:
            return 0
        i=0
        length=0
        sta=0
        dic={}
        while i<len(s):
            if s[i] in dic and sta <= dic[s[i]]:
                sta = dic[s[i]]+1
                dic[s[i]]=i
            else:
                dic[s[i]]=i
                if (i-sta+1)>length:
                    length=i-sta+1
            i+=1
        return length


