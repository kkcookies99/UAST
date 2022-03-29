 def XXX(self, s: str) -> bool:
    left, right = 0, len(s) - 1
    while(left < right):
        while(left < right and self.isNumOrLetter(s[left]) == False):
            left = left + 1
        while(left < right and self.isNumOrLetter(s[right]) == False):
            right = right - 1
        if(self.isEqual(s[left], s[right]) == False):
            return False
        else:
            left = left + 1
            right = right - 1
    return True 
def isNumOrLetter(self, s: str) -> bool:
    if((s >= 'a' and s <= 'z') or (s >= 'A' and s <= 'Z') or (s >= '0' and s<= '9')):
        return True
    return False
def isEqual(self, s1: str, s2: str) -> bool:
    # s1 >= 'a' / 'A' 是为了保证大小写间的比较, 防止数字与字母的比较(1P, 2Q et.al)
    if(s1 == s2 or (ord(s1) - 32 == ord(s2) and s1 >= 'a') or (ord(s1) + 32 == ord(s2) and s1 >= 'A')):
        return True
    return False

