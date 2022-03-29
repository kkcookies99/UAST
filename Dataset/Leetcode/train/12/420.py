 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        nums=[1000,900,500,400,100,90,50,40,10,9,5,4,1]
        values=['M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I']
        result=''
        for i in range(len(nums)):
            if nums[i]<=num:
                result+=num//nums[i]*values[i]
                num=num-num//nums[i]*nums[i]


        return result

