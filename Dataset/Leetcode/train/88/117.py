 class Solution:
    def XXX(self,num1,m,num2,n):
        p = m + n -1
        m =  m- 1
        n  = n - 1
        while(m>=0 and n >=0):
            if(num1[m] > num2[n]):
                num1[p] = num1[m]
                m = m -1
                p = p-1
            else:
                num1[p] = num2[n]
                n = n -1
                p = p-1
        while(n>=0):
            num1[p] = num2[n]
            n = n -1
            p = p-1
        return None

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


