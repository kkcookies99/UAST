class Solution:
    def XXX(self, s: str) -> int:
        '''逆序遍历，匹配空格'''
        # i,j=len(s)-1,len(s)-1
        # while i>-1:
        #     if s[j]==' ':
        #         j-=1
        #         i-=1
        #     elif s[i]==' ':
        #         break
        #     else:
        #         i-=1
        # return j-i
        '''正则截取'''
        reg = '(?:\s+)?(\w+)?(?:\s+)?'
        res = re.findall(reg,s)
        return len(res[-2])

