 class Solution:
    def XXX(self, s: str) -> bool:
        # 法一：非python该如何写？
        s = ''.join(filter(str.isalnum, s.lower()))
        return s == s[::-1]
        
        # 法二：给人看的
        # result = True
        # start = 0
        # end = len(s) - 1
        # while start < end:
        #     if not s[start].isalnum():
        #         start += 1
        #         continue
        #     elif not s[end].isalnum():
        #         end -= 1
        #         continue
            
        #     if s[start].lower() != s[end].lower():
        #         result = False
        #         break

        #     start += 1
        #     end -= 1
        
        # return result


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


