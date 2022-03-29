 class Solution:
    def XXX(self, a: str, b: str) -> str:
        """
        先转成数字
        先倒叙再累加
        """
        # a_int,b_int = int(a),int(b)
        n = min(len(a),len(b))
        ra,rb = a[::-1],b[::-1]
        s = ""
        tag = "0"
        for i in range(n):
            if ra[i] != rb[i]:
                if tag == "1":
                    s1 = '0'
                    tag = "1"
                else:
                    s1 = "1"
            else:
                if ra[i] == "0":
                    if tag == "1":
                        s1 = "1"
                        tag = "0"
                    else:
                        s1 = "0"
                else:
                    if tag == "1":
                        s1 = "1"
                        tag = "1"
                    else:
                        s1 = "0"
                        tag = "1"
            s += s1 
        if len(ra) > len(rb):
            for i in range(n,len(ra)):
                if ra[i] == "1":
                    if tag == "1":
                        s1 = "0"
                        tag = "1"
                    else:
                        s1 = ra[i]
                elif ra[i] == "0":
                    if tag == "1":
                        s1 = "1"
                        tag = 1
                    else:
                        s1 = ra[i]
                s += s1
        elif len(rb) > len(ra):
            for i in range(n,len(rb)):
                if rb[i] == "1":
                    if tag == "1":
                        s1 = "0"
                        tag = "1"
                    else:
                        s1 = rb[i]
                elif rb[i] == "0":
                    if tag == "1":
                        s1 = "1"
                        tag = 1
                    else:
                        s1 = rb[i]
                s += s1
        if tag == "1":    
            s = s+"1"      
        return s[::-1]

