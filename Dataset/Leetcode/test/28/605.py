 class Solution(object):
    def XXX(self, haystack, needle):
        lengthh = len(haystack)
        lengthn = len(needle)
        if lengthh == 0:
            return 0
        if lengthn == 0:
            return 0
        if lengthn>lengthh:
            return 0
        for i in range(lengthh - lengthn+1):
            if needle == haystack[i:i + lengthn]:
                yield i
            if  (needle != haystack[i:i + lengthn] )&(i == (lengthh-lengthn)):
                yield -1
        return 0


if __name__ == '__main__':
    mm = Solution()
    for i in mm.XXX('sgggggggg',"gg"):
        print(i)

