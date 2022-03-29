   class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return "1"

        temp =XXX(n-1)
        count = 1
        i = 0
        sum = list()
        while i + 1 < len(temp):
            if temp[i] == temp[i + 1]:
                count += 1
            if temp[i] != temp[i + 1]:
                sum.append(str(count))
                sum.append(temp[i])
                count = 1
            i += 1
        sum.append(str(count))
        sum.append(temp[-1])

        return "".join(sum)

