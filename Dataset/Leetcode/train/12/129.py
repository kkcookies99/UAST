 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        dic1 = {'0':'','1':'I','2':'II','3':'III','4':'IV','5':'V','6':'VI','7':'VII','8':'VIII','9':'IX'}
        dic2 = {'0':'','1':'X','2':'XX','3':'XXX','4':'XL','5':'L','6':'LX','7':'LXX','8':'LXXX','9':'XC'}
        dic3 = {'0':'','1':'C','2':'CC','3':'CCC','4':'CD','5':'D','6':'DC','7':'DCC','8':'DCCC','9':'CM'}
        dic4 = {'0':'','1':'M','2':'MM','3':'MMM'}
        num = str(num)
        s = ''
        lens = len(num)
        if lens==1:
            return dic1[num[0]]
        if lens==2:
            return dic2[num[0]] +dic1[num[1]]   
        if lens==3:
            return dic3[num[0]] +  dic2[num[1]] +dic1[num[2]] 
        if lens==4:
            return dic4[num[0]] + dic3[num[1]] +  dic2[num[2]] +dic1[num[3]] 

