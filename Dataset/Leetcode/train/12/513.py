 class Solution(object):
    def XXX(self, num):
        numtoR=[['','I','II','III','IV','V','VI','VII','VIII','IX'],
                ['','X','XX','XXX','XL','L','LX','LXX','LXXX','XC'],
                ['','C','CC','CCC','CD','D','DC','DCC','DCCC','CM'],
                ['','M','MM','MMM']]
        res=''
        for i in range(4):
            tmp=num%10
            res=numtoR[i][tmp]+res
            num//=10
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


