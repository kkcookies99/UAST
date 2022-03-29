class Solution:
    def XXX(self, x: int) -> int:
        first = 0
        last = x
        found = False
        midpoint = 0

        while first <= last and not found:
            midpoint = (first + last) // 2
            if midpoint * midpoint == x :
                found = True
            else:
                if x < midpoint * midpoint:
                    last = midpoint - 1
                else:
                    first = midpoint + 1

        if found is True:
            return int(midpoint)
        else:
            return first - 1

