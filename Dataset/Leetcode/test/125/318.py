     def XXX(self, s: str) -> bool:
        re = True
        enum = 0
        front = 0
        behind = 0
        length = int(len(s)/2)
        while length > enum:
            while not s[-(behind+1)].isalnum() and behind + 1 < len(s):
                behind += 1
            while not s[front].isalnum() and front + 1 < len(s):
                front += 1
            if behind + front + 1 >= len(s):
                break
            if (s[-(behind+1)].lower() == s[front].lower() or not s[-(behind+1)].isalnum or not s[front].isalnum()):
                behind += 1
                front += 1
            else : 
                re = False 
                break
            enum+=1
        return re

