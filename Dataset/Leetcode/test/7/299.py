class Solution:
    def XXX(self, x: int) -> int:
        """
        :type x: int
        :rtype : int
        """
        #1.分正负来讨论
        if x<0:
            x=abs(x)
            #2.整数->字符串->字符串列表,字符串列表反转
            list_x=list(str(x))
            result=XXXd(list_x)
            #3.字符串列表->字符->整数
            result=int("".join(result))
            result=-result
        else:
            #2.整数->字符串->字符串列表,字符串列表反转
            list_x=list(str(x))
            result=XXXd(list_x)
            #3.字符串列表->字符->整数
            result=int("".join(result))       
        
            
        #4.判断反转后的数字在不在范围内
        if -(pow(2,31))<result<(pow(2,31)-1):
            result=result
        else:
            result=0
 
        return result
