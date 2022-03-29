 class Solution(object):
    def XXX(self, nums):
        def nextXXX(temp,residue,result):
            if not residue:
                result.append(temp)
                return

            for i in range(len(residue)):
                nextXXX(temp+[residue[i]],residue[0:i]+residue[i+1:],result)

        temp = []
        result = []
        nextXXX(temp,nums,result)
        return result

