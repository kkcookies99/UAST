 class Solution(object):
    def dfs(self, s, num, seq, scale, mymap):
        if num <= 0:
            return s
        t = num//scale[seq]
        temp = t
        while temp:
            s += mymap[scale[seq]]
            temp = temp - 1
        num -= t * scale[seq]
        res = self.dfs(s, num, seq + 1, scale, mymap)
        return res

    def XXX(self, num):
        mymap = {1 : "I", 5 : "V", 10 : "X",
                 50 : "L", 100 : "C", 500 : "D", 1000 : "M", 0 : ""}
        scale = [1000, 500, 100, 50, 10, 5, 1]
        s = ""
        ans = self.dfs(s, num, 0, scale, mymap)
        ans = ans.replace("DCCCC", "CM")
        ans = ans.replace("CCCC", "CD")
        ans = ans.replace("LXXXX", "XC")
        ans = ans.replace("XXXX", "XL")
        ans = ans.replace("VIIII", "IX")
        ans = ans.replace("IIII", "IV")
        return ans


