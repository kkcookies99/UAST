 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        s = digits[::-1]
        i = 0
        if s[0]+1 < 10:       
            s[0] += 1
        else:
            while s[i]+1 >= 10:
                s[i] = 0
                i += 1
                if i != len(s):
                    s[i] += 1
                    if s[i] == 9:
                        break
                else:
                    s.append(1)
           
        s1 = s[::-1]
        return s1

