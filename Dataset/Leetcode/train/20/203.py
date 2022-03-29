 class Solution:
    def XXX(str) -> bool:
        list = []
        for i in range(len(str)):
            if str[i] is '(':
                list.append(str[i])
            elif str[i] is '{':
                list.append(str[i])
            elif str[i] is '[':
                list.append(str[i])
            elif str[i] is ')' and i > 0:
                if list[-1] is '(':
                    list.pop()
            elif str[i] is '}' and i > 0:
                if list[-1] is '{':
                    list.pop()
            elif str[i] is ']' and i > 0:
                if list[-1] is '[':
                    list.pop()

        return len(list) == 0

