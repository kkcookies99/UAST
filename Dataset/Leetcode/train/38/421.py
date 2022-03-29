 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """

        string = '1'
        n -= 1
        while n:
            string = self.auxiliaryFunc(string)
            n -= 1
        return string

    def auxiliaryFunc(self, string):
        """
        :type string: str
        :rtype: str
        """

        length = len(string)
        ans = ''
        i = 0

        while i < length:
            j = i + 1
            tmp = string[i]
            while j < length:
                if string[j] != tmp:
                    break
                j += 1
            ans += str(len(string[i: j])) + string[i]
            i = j
        return ans

