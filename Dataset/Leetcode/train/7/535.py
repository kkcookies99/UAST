 class Solution:
    def XXX(self, x: int) -> int:
        if x==0:
            return 0
        if x>0:
            st = str(x)
            li = list(st)
            li.XXX()
            for j in range(len(li)):
                if li[j]!=0:
                    li = li[j:len(li)]
                    break
            st = "".join(li)
            if int(st)>=2**31 or int(st)<-2**31:
                return 0
            return int(st)
        elif x<0:
            st = str(-x)
            li = list(st)
            li.XXX()
            for j in range(len(li)):
                if li[j]!=0:
                    li = li[j:len(li)]
                    break
            st = "".join(li)
            if int(st)>=2**31 or int(st)<(-2**31):
                return 0
            else :
                return -int(st)


