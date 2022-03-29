 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        length = len(haystack)
        n_l = len(needle)
        if length == 0 and n_l == 0  or length !=0 and n_l ==0:
            return 0
        elif length == 0 and n_l != 0:
            return -1

        index = 0
        first_c = needle[0]
        while(index + n_l <= length):
            if haystack[index:index+n_l] != needle:
                last = haystack[index:index+n_l][-1]
                if last in needle:
                    step = needle[::-1].find(last)
                    if step:
                        index = index + step
                    else:
                        index += 1
                else:
                    index += n_l
            else:
                return index
        return -1

