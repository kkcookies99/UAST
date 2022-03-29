 class Solution:
    def XXX(self, s: str) -> bool:
        stack = []
        stack.append(s[0])
        for ch in s[1:]:
            if stack.__len__() == 0:
                if self.isLeftSymbol(ch):
                    stack.append(ch)
                else:#第一种情况，栈为空了，但是还有位匹配完的括弧
                    return False
            elif self.isRightSymnol(ch):

                if stack[-1]==self.getSymbol(ch):
                    stack.pop()
                elif stack[-1]!=self.getSymbol(ch):
                    return False #第二种情况  括弧之间不匹配
            else:
                stack.append(ch)
        return stack.__len__()==0 #第三种情况   栈中还有剩余符号
    def getSymbol(self,s:str)->str:
        hashMap= {}
        hashMap["("]=")"
        hashMap["{"]="}"
        hashMap["["]="]"
        hashMap[")"] = "("
        hashMap["}"] = "{"
        hashMap["]"] = "["
        return hashMap.get(s)
    def isLeftSymbol(self,s:str)->bool:
        return s=="[" or s=="{" or s=="("
    def isRightSymnol(self,s:str)->bool:
        return self.isLeftSymbol(s)==False


