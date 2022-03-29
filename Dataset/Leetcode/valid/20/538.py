 class Solution:
    def XXX(self, s: str) -> bool:
        if len(s)%2==1:
            return False;
        ans=[];
        for i in range(len(s)):
            if s[i]=='(' or s[i]=='{' or s[i]=='[':
                ans.append(s[i]);
            elif not len(ans):
                return False;
            else:
                b=ans.pop();
                bb=ord(b);
                cc=ord(s[i]);
                if cc-bb>2 or cc-bb<0:
                    return False;
        if not len(ans):
            return True;
        else:
            return False;

