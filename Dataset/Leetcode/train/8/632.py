 class Solution:
    def XXX(self, s: str) -> int:
        reg = ''
        Flag = True
        for i in s:
            
            if i >='0' and i <='9':
                reg += i
                Flag = False
            elif Flag:
                if i == '+' or i == '-':
                    if reg == '':
                        reg = i
                    else:
                        reg = ''
                        break
                elif i == ' ':
                    if reg == '':
                        continue
                    else: 
                        break
                else:
                    break
            else:
                break
        
        if reg == '+' or reg == '-':
            reg = ''
        z = int(reg) if reg!='' else 0
        z = 2 ** 31 - 1 if z > 2 ** 31 - 1 else z
        z = z = - 2 ** 31 if z < -2 ** 31 else z

        return z

