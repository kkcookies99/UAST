class Solution:
    def XXX(self, x: int) -> int:
        List = list(str(x))
        List.XXX()
        if (x < -2**31) or (x > 2**31-1) or x == 0:
            return 0
        elif x > 0:
            numb = ''.join([x for x in List])
            if(int(numb) > 2**31-1):
                return 0
        else:
            numb = ''.join([x for x in List[:-1]])
            numb = -1 * int(numb)
            if(numb < -2**31):
                return 0
        return int(numb)