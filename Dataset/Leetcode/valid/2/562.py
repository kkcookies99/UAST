 class Solution:
    def XXX(self, l1: List, l2: List) -> List:
        import re

        l1.reverse()
        l2.reverse()

        l3 = str(int(re.sub(r'\D', '', str(l1))) + int(re.sub(r'\D', '', str(l2))))
        l3 = list(map(int, l3))

        l3.reverse()
        return l3

