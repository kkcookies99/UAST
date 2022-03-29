 class Solution:
    def XXX(self, num: int) -> str:
        d={1:"I",5:"V",10:"X",50:"L",100:"C",500:"D",1000:"M"}
        res=[]
        bit=1
        while num!=0:
            remainder=num%10
            if remainder==4:
                res.append(d[5*bit]+d[bit])
            elif remainder==9:
                res.append(d[10*bit]+d[bit])
            else:
                if remainder>=5:
                    res.append((remainder-5)*d[bit]+d[5*bit])
                else:
                    res.append(remainder*d[bit])
            bit*=10
            num//=10
        return "".join(res)[::-1]


