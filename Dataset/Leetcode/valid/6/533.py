 class Solution(object):
    def XXX(self, s, numRows):
        n = 2*numRows-2
        if n==0:
            return s
        nz = int(len(s)/n) +1
        a = [i*n for i in range(nz)]
        m = []
        k=numRows-2
        kk=1
        while kk<=k:
            m.extend(sum([[n*i+kk, n*i+n-kk] for i in range(nz)], []))
            kk = kk+1
        z = [i*n+kk for i in range(nz)]
        return ''.join([s[i] for i in a+m+z if i<len(s)])


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


