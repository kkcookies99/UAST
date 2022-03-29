 class Solution:
    def XXX(self, num: int) -> str:
        igtoroman1=['','I','II','III','IV','V','VI','VII','VIII','IX']
        igtoroman2=['','X','XX','XXX','XL','L','LX','LXX','LXXX','XC']
        igtoroman3=['','C','CC','CCC','CD','D','DC','DCC','DCCC','CM']
        igtoroman4=['','M','MM','MMM']
        return igtoroman4[num//1000]+igtoroman3[num%1000//100]+igtoroman2[num%100//10]+igtoroman1[num%10]

