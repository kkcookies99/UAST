 class Solution:
    def XXX(self, strs: List[str]) -> str:
        i = 0
        j = min([len(string) for string in strs])
        ans = ''
        fa =''
        while i < j:
            for string in strs:
                ans += string[i]
            if len(set(ans))==1:
                ans = ''
                fa += string[i]
            else:
                break
            i+=1
        return fa

