class Solution:
    def XXX(self, str: str) -> int:
        #去前面空格
        str_lstrip=str.lstrip()
        
        
        #判断非空
        if str_lstrip=='':
            return 0 
        
        flag=0
        ans_str=''
        #记录符号，并为开始判断之后是否是数字作准备
        if str_lstrip[0]=='-'or'+':
            ans_str=str_lstrip[0]
            flag=1
        
        #try判断是否是数字，其中的print是用来检查出错时，
        for index in range(len(str_lstrip)):
            try:
                int(str_lstrip[index+flag])
                ans_str+=str_lstrip[index+flag]
                # print(ans_str)
            except:
                # print('finish')
                break
                
        #判断是否溢出，python里int无限大        
        try:
            ans_int=int(ans_str)
            if 2147483647>ans_int>-2147483648:
                return ans_int
            elif ans_int>0:
                return 2147483647
            else:
                return -2147483648
        except:
            return 0

