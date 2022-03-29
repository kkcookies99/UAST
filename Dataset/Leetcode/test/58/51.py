 class Solution:
    def XXX(self, s: str) -> int:
        if not s:
            return 0
        if s == " ":
            return 0
        if len(s)==1:
            return 1
        r = 0
        count =0
        last = 0
        while r<=len(s)-2:
            if s[r] != " ":
                r+=1
                count += 1
                last=count
            else:
                r += 1
                if count !=0:
                    last = count
                count=0

        if s[r] == " ":
            return last
        else:
            return last+1

