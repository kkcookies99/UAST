 class Solution:
    def XXX(self, s: str) -> bool:
        dic = {'(':1,')':-1,'[':2,']':-2,'{':3,'}':-3} #定义一个符号字典，给每对符号赋相反的两个值，方便计算是否为配对符号
        stack = [] #搞个栈
        for sym in s:
            if dic[sym] > 0: #>0意味着是左符号
                stack.append(sym) #左符号随便写永远不会错，统统压到栈内
            else: #<0则意味着是右符号
                if not stack: #如果栈里啥都没有就想压入右符号是不被允许的
                    return False
                if dic[stack[-1]] + dic[sym] == 0: #如果当前符号跟上一个符号的和为0，则意味着是配对的，则弹出上一个符号
                    stack.pop()
                else:
                    return False #不配对还得了？赶紧结束吧！
        return not stack #能到这一步栈里还是空的？那就意味着所有的左右符号都配对了，栈里的符号全弹完了。

