 class Solution:
    def XXX(self, str: str) -> int:
        m =[]
        label =False
        l2 = False
        for i in str:
            if i !=" ":
                if label and l2:
                    return 0
                if i =='-':
                    if not label and m ==[]:
                        label=True
                        continue
                    elif label and m==[]:
                        return 0
                    else:
                        break
                if i =='+':
                    if not l2 and m==[]:
                        l2 = True
                        continue
                    elif l2 and m==[]:
                        return 0
                    else:
                        break
                if i ==".":
                    break
                if i.isdigit():
                    m.append(i)
                    continue
                elif m==[]:
                    return 0
                else:
                    break
            elif m!=[]:
                break
            elif label or l2:
                return 0
        m.reverse()
        n=0
        re=0
        for i in m:
            re+=int(i)*(10**n)
            n+=1
        if label:
            re=-re
        if re<(-2**31):
            return (-2**31)
        elif re > (2**31-1):
            return (2**31-1)
        else:
            return re

