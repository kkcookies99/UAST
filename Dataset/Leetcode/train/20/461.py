 class Solution(object):
    def XXX(self, s):
        stack = []
        hashmap = {
            ")" : "(",
            "]" : "[",
            "}" : "{",
        }
        for item in s:
            if item in ["(", "[", "{"]:
                stack.append(item) 
            if item in [")", "]", "}"]:
                if len(stack) == 0:
                    return False
                x = stack.pop()
                if hashmap[item] != x:
                    return False
        
        return len(stack) == 0
                

