 class Solution:
   def XXX(self, haystack: str, needle: str) -> int:
       if len(needle) == 0:
           return 0
       if len(haystack) == 0:
           return -1
       #不用内置函数，直接以needle的长度依次遍历
       for i in range(len(haystack)):
           if haystack[i:i+len(needle)] == needle:
               return i
       return -1

