 class Solution:
    def XXX(self, s: str) -> int:
        l_len = 0
        r_len = len(s)
        mid_len = int((l_len + r_len)/2)
        not_stop = 1
        out = 0
        while(not_stop):
            if(self.unique(s)):
                out = len(s)
                not_stop = 0

            else:
                nothing = True
                for i in range(len(s)-mid_len+1):
                    if self.unique(s[i:i+mid_len]):
                        out = mid_len
                        nothing = False
                        break

                if nothing:
                    r_len = mid_len
                else:
                    l_len = mid_len
                mid_len = int((l_len + r_len)/2)
                if l_len==r_len or l_len == mid_len or mid_len==r_len:
                    not_stop = 0
                    out = mid_len
            
        return out

    def unique(self, s):
        if len(s) == len(list(set(s))):
            return True
        else:
            return False


