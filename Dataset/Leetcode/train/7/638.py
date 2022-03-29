 class Solution:
    def XXX(self, x: int) -> int:
        length=0
        result=[]
        if x==0 :
            return 0
        strnum=str(abs(x))                                                            #将该数绝对值然后存成字符串
        length=len(strnum)                                                          #获取这个数的长度
        for i in range(length):
            result.append(strnum[length-i-1])                              #用列表把这个字符串反着存
            number="".join(result)                                               #列表转成字符串
            num=int(number)                                                     #字符串转成int数
        if x<0 and num>(2**31) or x>0 and num>(2**31-1):  #判断数是否越界
            return 0
        if x>0:
            return num
        if x<0:
            return (0-num)

