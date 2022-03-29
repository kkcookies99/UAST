 class Solution:
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        
        copya = [int(x) for x in a]
        copyb = [int(x) for x in b]
        if len(copya) > len(copyb):
            result = copya
        else:
            result = copyb
        for i in range(min(len(copya),len(copyb))):
            result[-i-1] = copya[-i-1] + copyb[-i-1]
        for i in range(len(result) - 1):
            if result[-i-1] == 2:
                result[-i-1] = 0
                result[-i-2] += 1
            elif result[-i-1] == 3:
                result[-i-1] = 1
                result[-i-2] += 1
        if result[0] == 2:
            result[0] = 0
            result = [1] + result
        elif result[0] == 3:
            result[0] = 1
            result = [1] + result
        
        return "".join("%s" %id for id in result)

