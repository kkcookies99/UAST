 class Solution:
    def XXX(self, n: int) -> List[str]:
        l1 = [["(", 1, 0]]
        for i in range(n*2-1):
            l2 = []
            for sign, x, y in l1:
                if x > y:
                    if x < n:
                        l2.append([sign + "(", x + 1, y])
                    if y < n:
                        l2.append([sign + ")", x, y + 1])
                else:
                    if x < n:
                        l2.append([sign + "(", x + 1, y])
            l1 = l2
        return [i[0] for i in l1]

