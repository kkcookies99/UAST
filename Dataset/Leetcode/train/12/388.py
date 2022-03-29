 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        ans = ''
        marks = [['I', 'V', 'X'], ['X', 'L', 'C'], ['C', 'D', 'M'], ['M']]
        i = 0
        while num > 0:
            module = num % 10
            if module == 4 or module == 5:
                ans = marks[i][0] * (5 - module) + marks[i][1] + ans
            elif module == 9:
                ans = marks[i][0] + marks[i][2] + ans
            elif module <  4:
                ans = marks[i][0] * module + ans
            else:
                ans = marks[i][1] + marks[i][0]* (module - 5) + ans
            i += 1
            num /= 10
        return ans

