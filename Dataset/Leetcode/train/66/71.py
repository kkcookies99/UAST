 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        digits.reverse()
        list1 = digits
        def t(list1, output):
            output += list1[-1] * 10**(len(list1)-1)
            if len(list1) == 1:
                return output
            list1.pop()
            return t(list1, output)
        return list(map(int, str(t(list1,0)+1)))

