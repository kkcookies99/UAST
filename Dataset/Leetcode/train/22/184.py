 class Solution:
    def XXX(self, n: int) -> List[str]:
        result = [['()'], ['(())', '()()']]
        if n <= 2:
            return result[n-1]
        for i in range(2, n):
            base = result[-1]
            new = []
            for i in base:
                for j in range(len(i)):
                    if i[j] == "(":
                        new.append(i[:j+1] + '()' + i[j+1:])
                    new.append('()' + i)
                    new.append(i + '()')
            result.append(list(set(new)))
        return result[-1]

