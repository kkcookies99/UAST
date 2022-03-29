 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        grid = {
            1: ('I', 'IV', 'V', 'IX'),
            2: ('X', 'XL', 'L', 'XC'),
            3: ('C', 'CD', 'D', 'CM'),
            4: ('M', '', '', '')
        }

        s = ''

        i = 0

        while True:
            i += 1
            
            if i > 4:
                return s

            a = num % 10

            if a in (4, 9):
                s = "{0}{1}".format((a % 10 == 4 and grid[i][1] or grid[i][3]), s)

            elif a < 4:
                s = "{0}{1}".format(grid[i][0] * a, s)

            elif a > 4:
                s = "{0}{1}{2}".format(grid[i][2], grid[i][0] * (a - 5), s)

            num = int(num / 10)

            if not num > 0:
                return s

