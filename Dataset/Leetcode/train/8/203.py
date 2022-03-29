class Solution:
    def XXX(self, str: str) -> int:
        if len(str)==0:
            return 0
        i=0
        while i<len(str) and str[i]==' ':
            i+=1
        if i<len(str):
            l=[]
            if (str[i] in ['+','-']) or str[i].isnumeric():#判断第一个是否为正负号或者数字
                l.append(str[i])
                i+=1
                while i<len(str) and str[i].isnumeric():#如果是数字就一直添加到list里面
                    l.append(str[i])
                    i+=1
                if l[0] in ['+','-']:#可能list里面只有一个正负号
                    if len(l)>1:#判断一下还有数字
                        x=int(''.join(l))
                    else:
                        return 0
                else:
                    x=int(''.join(l))
                if x>2**31-1:
                    return 2**31-1
                elif x<-2**31:
                    return -2**31
                else:
                    return x
            else:
                return 0
        else:
            return 0

