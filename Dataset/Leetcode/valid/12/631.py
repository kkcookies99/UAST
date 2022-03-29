 class Solution:
    def XXX(self, num: int) -> str:
        d = {1: {1: 'I',5: 'V'}, 2: {1: 'X',5: 'L'},3: {1: 'C',5: 'D'}, 4: {1: 'M'}}
        text = ''
        lists = list(str(num))
        m = len(lists)

        for i in lists:
            i = int(i)
            if i < 4:
                text += d[m][1] * i
            elif i == 4:
                text += d[m][1] + d[m][5]
            elif i == 5:
                text += d[m][5]
            elif i < 9:
                text += d[m][5] + (d[m][1]*(i-5))
            else:
                text += d[m][1] + d[m+1][1]
            m -= 1
        return text


