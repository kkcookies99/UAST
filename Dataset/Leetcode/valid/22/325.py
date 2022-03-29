 class Solution:
    def XXX(self, n: int) -> List[str]:
        s=""
        list=[]
        def func(s,a,b):
            if (a+b)==2*n:
                list.append(s)
            else:
                if a<n:
                    s=s+'('
                    func(s,a+1,b)
                    s=s[:-1]
                if b<a:
                    s=s+')'
                    func(s,a,b+1)
                    s=s[:-1]
        func(s,0,0)
        return list

