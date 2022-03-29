class Solution:
    def XXX(self, x: int) -> int:
        res=x
        while abs(res**2-x)>10**(-6):
            res=res/2+x/(2*res)
        return int(res)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


