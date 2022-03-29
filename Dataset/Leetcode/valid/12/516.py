 class Solution:
    def XXX(self, num: int) -> str:
        one = ['','I','II','III','IV','V','VI','VII','VIII','IX']
        ten = ['','X','XX','XXX','XL','L','LX','LXX','LXXX','XC']
        hrd = ['','C','CC','CCC','CD','D','DC','DCC','DCCC','CM']
        ths = ['','M','MM','MMM']
        return ths[num//1000]+hrd[num//100%10]+ten[num//10%10]+one[num%10]

