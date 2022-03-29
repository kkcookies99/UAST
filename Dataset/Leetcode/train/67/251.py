 class Solution:
    def XXX(self, a: str, b: str) -> str:
        end=''
        fur=False
        while len(a)!=len(b):
            if len(a)<len(b):
                a='0'+a
            else:b='0'+b
        for i in range(len(a)-1,-1,-1):
            if a[i]=='1' and b[i]=='1' and fur==False:
                end='0'+end
                fur=True
            elif a[i]=='1' and b[i]=='1' and fur==True:
                end='1'+end
    
            elif a[i]=='0'and b[i]=='0' and fur==False:
                end='0'+end
            elif a[i]=='0'and b[i]=='0'and fur==True:
                end='1'+end
                fur=False
                
            elif a[i]=='1'and b[i]=='0'and fur==False or a[i]=='0'and b[i]=='1' and fur==False:
                end = '1'+end
            elif a[i]=='1'and b[i]=='0'and fur==True or a[i]=='0'and b[i]=='1' and fur==True:
                end = '0'+end
        if fur:end='1'+end    
        return end

