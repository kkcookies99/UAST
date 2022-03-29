 class Solution:
    def XXX(self, s: str) -> int:
        num=s.count('I')+s.count('V')*5+s.count('X')*10+s.count('L')*50+s.count('C')*100+s.count('D')*500+s.count('M')*1000
        num-=(s.count('IV')+s.count('IX'))*2+(s.count('XL')+s.count('XC'))*20+(s.count('CD')+s.count('CM'))*200
        return num

