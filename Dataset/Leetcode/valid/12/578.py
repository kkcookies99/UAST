 class Solution(object):
    def XXX(self, num):
        out = []
        def getN (num,str1):
            if num == 0:
                out.append(str1)
                return 
            if num >= 1000:
                getN(num-1000,str1+'M')
            elif num >= 900:
                getN(num-900,str1+"CM")
            elif num >= 500:
                getN(num-500,str1+"D")
            elif num >=400:
                getN(num-400,str1+"CD")
            elif num>=100:
                getN(num-100,str1+'C')
            elif num>=90:
                getN(num-90,str1+"XC")
            elif num >= 50:
                getN(num-50,str1+"L")
            elif num>=40:
                getN(num-40,str1+"XL")
            elif num >= 10:
                getN(num-10,str1+"X")
            elif num == 9:
                out.append(str1+"IX")
                return 
            elif num >=5:
                getN(num-5,str1+"V")
            elif num == 4:
                out.append(str1+"IV")
                return
            else:
                getN(num-1,str1+"I")
        getN(num,'')
        return out[0]

