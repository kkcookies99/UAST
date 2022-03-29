 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows==1:
            return s
        res_list = []
        res = ''
        for i in range(numRows):
            res_list.append([])
        gl = 2 * numRows - 2
        for index in range(len(s)):
            pos = index % gl
            res_list[pos].append(s[index]) if pos <= gl * 0.5 else res_list[numRows - (pos-gl//2) - 1].append(s[index])
        for ls in res_list:
            for c in ls:
                res += c
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

