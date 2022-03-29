 class Solution:
    def XXX(self, s: str) -> str:
        left,right=0,len(s)
        ans=[]
        max_len=0
        for i in range(len(s)):
            left=i
            right=len(s)
            while left<right:
                if right-left<=max_len:
                    break
                tmp=s[left:right]
                if tmp==tmp[::-1]:
                    ans.append(tmp)
                    max_len=right-left
                    break
                else:
                    right-=1
        return ans[-1]

