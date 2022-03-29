 class Solution:
    def XXX(self, s: str) -> bool:
        S=[]
        x=''
        for i in s:
            if i=='(' or i=='[' or i=='{':
                S.append(i)
            if i==')' or i==']' or i=='}':
                if S==[]:
                    return False
                x=S.pop()+i
                if x!='()' and x!='{}' and x!='[]':
                    return False
        return S==[]

