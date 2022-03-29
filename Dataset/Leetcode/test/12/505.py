 class Solution:
    def XXX(self, num: int) -> str:
        list1=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
        list2=['M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I']
        result=""
        for i in range(len(list1)):
            while num>=list1[i]:
                result+=list2[i]
                num-=list1[i]
        return result

