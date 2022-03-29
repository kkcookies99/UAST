 class Solution:
    def XXX(self, num: int) -> str:
        result = []
        sign = ['I', 'V', 'X', 'L', 'C', 'D', 'M', '']
        i = 0
        while num > 0:
            x = num % 10
            num //= 10
            if x == 4:
                result.append(sign[i*2] + sign[i*2+1])
            elif x == 9:
                result.append(sign[i*2] + sign[(i+1)*2])
            else:
                result.append(sign[i*2+1] * (x // 5) + sign[i*2] * (x % 5))
            i += 1
        result.reverse()
        return "".join(result)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


