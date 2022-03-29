 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if haystack=='' and needle=='' :
            return 0
        else:
            if needle in haystack:
                for i in range(len(haystack)):
                    if haystack[i:i+len(needle)] == needle:
                        return i
            else:
                return -1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

