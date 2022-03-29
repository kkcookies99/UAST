 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        cycle = []
        for i in range(numRows):
            cycle.append(i)
        for i in range(numRows-1,1,-1):
            cycle.append(i-1)

        pattern = ['' for i in range(numRows)]
        for i in range(len(s)):
            pattern[cycle[i%len(cycle)]] += s[i]

        result = ''
        for i in range(numRows):
            result += str(pattern[i])
        return result

