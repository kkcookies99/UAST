class Solution:
    def XXX(self, s: str) -> int:
        '''
        从最右边的数往左的进行相加
        若左边的数比右边大，则相加，若左边的数比右边小，则相减
        '''
        a = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000} #各字符对应的数字
        list_s1 = list(s)
        last_number = a[list_s1.pop()]  #先计算最后一位数值
        result = last_number    
        list_s2 = list_s1[:]    #重新建立一个副本
        for i in range(len(list_s2)): #从后向前弹出栈，两两向前比较值得大小，若左边的数比右边大，则相加，若左边的数比右边小，则相减
            pre_number = a[list_s1.pop()]
            if pre_number < last_number:
                result = result - pre_number
            else:
                result = result  + pre_number
            last_number = pre_number
        return result


