 class Solution:
    def XXX(self, x: int) -> bool:
        flag=1
        # 通过数组利用栈的思想
        array_stack=[]
        str_x=str(x)
        for item in range(len(str_x)):
            array_stack.append(str_x[item])
        for item in range(int(len(str_x)/2)):
            if array_stack.pop()!=str_x[item]:
                flag=0
        if flag==1:
            return True
        else:
            return False

