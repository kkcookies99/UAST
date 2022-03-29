class Solution:
    def XXX(self, s: str) -> int:
        dict = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        value = 0
        for i in range(len(s)-1,-1,-1):
            if  i == len(s)-1 or dict[s[i]] >= dict[s[i + 1]]:
                value += dict[s[i]]
            else:
                value -= dict[s[i]]
        return value

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

