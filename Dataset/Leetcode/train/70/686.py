class Solution:
    def XXX(self, n: int) -> int:
        if n<=2:
            return n
        lo,hi = 1,2
        for i in range(3,n+1):
            lo,hi = hi,hi+lo
        return hi

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


