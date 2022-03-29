     def XXX(self, digits: List[int]) -> List[int]:
        if len(digits) <= 0:
            return None
        
        n = 0
        for x in digits:
            n *= 10
            n += int(x)
        n += 1
        
        res = []
        while n>0:
            res.append(n%10)
            n//=10

        return res[::-1]

