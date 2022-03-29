 class Solution:
    def XXX(self, x: int):
        y=''
        new_str=str(x)
        if new_str[0] == '-' :
            new_str=new_str[1:]+'-'
        for i in new_str :    
            y=i+y
         
        if -2**31<int(y)<2**31-1:
            return int(y)
        else:
            return 0
        

