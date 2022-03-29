 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == "":        #needle为空字符串
            return 0
        #elif (haystack == "") and (needle != ""):   #needle不为空，haystack为空时
            #return -1
        elif len(haystack) < len(needle):   #当needle的长度小于haystack时，返回-1
            return -1
        else:                       #切片的方式判断是否相等
            for i in range(len(haystack)):
                if(haystack[i] == needle[0]):
                    if (haystack[i:(i+len(needle))] == needle):
                        return i
        return -1

