 class Solution:
    def XXX(self, num):
        l = [
            ('','I'),
            ('V','X'),
            ('L','C'),
            ('D','M'),
        ]

        ans,n = '',1
        while num>0:
            j = num%10
            i,j = divmod(j+1,5) # j+1 是为了让 4变5,9变10
            if j:
                ans = (j-1)*l[n-1][1]+ans  # j-1 将加上去的1变回原来的数
            if i:
                ans = l[n][i-1]+ans
                if not j:   # 判断是否需要添加前项
                    ans = l[n-1][1]+ans 

            num//=10
            n+=1
        
        return ans




undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


