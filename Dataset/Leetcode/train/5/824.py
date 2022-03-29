 class Solution:
    def XXX(self, s):
        ss  = ' '.join(s)
        maxl = 1
        maxi = maxj = 0
        for i in range(len(ss)):
            j = 0
            while i - j >= 0 and i + j < len(ss):
                if ss[i - j] == ss[i + j]:
                    if ss[i - j] != ' ':
                        l = j + 1                     
                        maxj = j if l > maxl else maxj
                        maxi = i if l > maxl else maxi
                        maxl = l if l > maxl else maxl
                else:
                    break
                j += 1

        return ss[maxi - maxj: maxi + maxj + 1].replace(' ','')

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


