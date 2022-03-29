 class Solution:
    def XXX(self, s):
        s=list(map(ord,s))
        ans=[]
        for i in s:
            if 65<=i<=90:
                ans.append(i+32)
            if 48<=i<=57 or 97<=i<=122:
                ans.append(i)
        ans=list(map(chr,ans))
        return ans==ans[::-1]

