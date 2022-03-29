 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 1:
            return ['()']
        res = []
        for i in self.XXX(n-1):
            res.append('(' + i + ')')
            res.append('()' + i)
            res.append(i + '()')
            for j in range(1,len(i)):
                temp_lst = list(i)
                temp_lst.insert(j, '()')
                res.append(''.join(temp_lst))
        res = list(set(res))
        res.sort()
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


