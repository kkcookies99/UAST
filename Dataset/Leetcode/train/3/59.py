 class Solution:
    def XXX(self, s: str) -> int:
        count=0
        tmp_s=''
        for i in s:
            if not i in tmp_s:
                tmp_s +=i
            else:
                tmp_s=tmp_s[tmp_s.find(i)+1:]+i
            if len(tmp_s)>count:
                count=len(tmp_s)
        return count