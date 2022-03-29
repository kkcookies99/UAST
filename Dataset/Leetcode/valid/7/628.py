 class Solution:
    def XXX(self, x: int) -> int:
        if x == 0 :
            return 0
        s = str(abs(x))
        s = s[::-1]
        n = int(s)
        if(x<0):
            if(-n < -2147483648):
                return 0
            return -n
        if(n > 2147483647):
            return 0
        return n

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


