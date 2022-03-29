 class Solution:
    def XXX(self, a: str, b: str) -> str:
        sol = []
        a, b = list(a[::-1]), list(b[::-1])
        index = 0
        plus_one = False
        while a or b:
            if a and b:
                if a[index]=='1' and b[index]=='1':
                    if not plus_one:
                        plus_one = True
                        sol.append('0')
                        a.pop(0)
                        b.pop(0)
                    else:
                        sol.append('1')
                        a.pop(0)
                        b.pop(0)
                elif (a[index]=='1' and b[index]=='0') or (a[index]=='0' and b[index]=='1'):
                    if not plus_one:
                        sol.append('1')
                        a.pop(0)
                        b.pop(0)
                    else:
                        sol.append('0')
                        plus_one = True
                        a.pop(0)
                        b.pop(0)
                else:
                    if not plus_one:
                        sol.append('0')
                        a.pop(0)
                        b.pop(0)
                    else:
                        sol.append('1')
                        plus_one = False
                        a.pop(0)
                        b.pop(0)
            elif a:
                if plus_one:
                    if a[index]=='1':
                        sol.append('0') 
                    else:
                        plus_one = False
                        sol.append('1')
                else:
                    sol.append('1') if a[index]=='1' else sol.append('0')
                a.pop(0)       
            elif b:
                if plus_one:
                    if b[index]=='1':
                        sol.append('0') 
                    else:
                        plus_one = False
                        sol.append('1')
                else:
                    sol.append('1') if b[index]=='1' else sol.append('0')
                b.pop(0)
        if plus_one:
            sol.append('1')
        return ''.join(sol[::-1])

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


