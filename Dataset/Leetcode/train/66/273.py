     def XXX(self, digits: List[int]) -> List[int]:
        return [int(dgt) for dgt in list(str(int("".join([str(digit) for digit in digits])) + 1))]

