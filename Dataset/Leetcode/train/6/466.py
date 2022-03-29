 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if len(s) <= numRows or numRows==1:
            return s
        ans = ['']*numRows
        for i in range(1,len(s)+1):
            l = i%(2*numRows-2)
            if not l:
                l = 2*numRows-2
            if l > numRows:
                l = 2*numRows-l
            ans[l-1] += s[i-1]
        return ''.join(ans)```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


