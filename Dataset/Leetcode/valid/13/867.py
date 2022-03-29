 class Solution:
    def XXX(self, s: str) -> int:
        roman_dict={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        special_dict={'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
        result=0
        for item in special_dict:
            if s.find(item) !=-1:
                s=s.replace(item,'')
                result=result+special_dict.get(item)
        for item in s:
            result=result+roman_dict.get(item)
        return result
    

