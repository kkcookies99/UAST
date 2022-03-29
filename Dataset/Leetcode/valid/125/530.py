 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        m = len(s)
        if m==0:
            return True
        
        str1 = ""
        for c in s:
            if c.isalnum():
                str1 = str1+c
            else:
                continue
        print(str1)
        n = len(str1)
        if n%2!=0:
            mid = (n-1)//2
            str2 = str1[0:mid].lower()
            str3 = str1[-1:mid:-1].lower()
            print(str2)
            print(str3)
            if str2==str3:
                return True
            else:
                return False
        else:
            mid = (n-1)//2
            str2 = str1[0:mid+1].lower()
            str3 = str1[-1:mid:-1].lower()
            print(str2)
            print(str3)
            if str2==str3:
                return True
            else:
                return False

