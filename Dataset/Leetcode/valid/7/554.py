 class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        bit = len(str(x))
        out = 0

        if x>=0:
            for i in range(bit):
                num = x % 10
                out += num * 10**(bit-i-1)
                x = x / 10
        else:
            x = -x
            for i in range(bit-1):
                num = x % 10
                out += num * 10**(bit-i-2)
                x = x / 10
            out = -out
        if not -2**31<out<2**31-1:
            return 0
        return int(out)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


