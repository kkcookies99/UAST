 class Solution:
    def XXX(self, x: int) -> int:
        x_list=[i for i in str(x)]
        x_list=[i for i in XXXd(x_list)]
        res_str=''
        is_fushu=False
        for i in range(len(x_list)):
            # 如果是负数
            if x_list[i]=="-":
                x_list[i]=(" ")
                is_fushu=True
            if x_list[0]=="0":
                if len(x_list)>1:
                    x_list[0]=" "
                else:
                    x_list[0]='0'
            if is_fushu:
                res_str+=x_list[i]
                res_str="-"+res_str
            res_str+=x_list[i]
            res=res_str.replace(' ','')
            res=int(res) if res else None
        return res if res in range(-2**31,2**31) else 0


