 def XXX(self, digits: List[int]) -> List[int]:
    num = str(int(''.join([str(a) for a in digits])) + 1)
    return [int(i) for i in num]

