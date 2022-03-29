 class Solution:
    def XXX(self, digits):
        num = ""
        for i in digits:
            num += str(i)

        return [ int(i) for i in list(str(int(num) + 1))]

