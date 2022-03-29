 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not len(strs): 
            return ""
        res = ""
        for item in strs:
            if item == '':
                return ""
            if res == "":
                res = item
            else:
                for index in range(0, min(len(item),len(res))):
                    if res[index] != item[index] :
                        res = res[0:index]
                        if index == 0:
                            return ""
                        else:
                            break
                    if index == (min(len(item),len(res))-1):
                        res = res[0:index+1]
                        break
        return res

