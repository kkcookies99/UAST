 class Solution:
    def XXX(self, n: int) -> str:
        res1=''
        if n == 1:
            return '1'
        form = self.XXX(n-1)
        res = []
        count = 1
        value = form[0]
        for i in range(1,len(form)):
            if form[i] == value:
                count += 1
            else:
                res.append(count)
                res.append(value)
                value = form[i]
                count = 1
        res.append(count)
        res.append(value)
        res1 = ''.join('%s' %d for d in res)
        return res1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


