class Solution:
    def XXX(self, a: str, b: str) -> str:
        res = ""
        carry = 0
        pos = 0
        lengthA = len(a)
        lengthB = len(b)
        while pos < lengthA and pos < lengthB:
            tmpSum = int(a[lengthA-1-pos])+int(b[lengthB-1-pos])+carry
            # print(a[lengthA-1-pos], b[lengthB-1-pos], carry, res, tmpSum)
            if tmpSum >= 2:
                carry = 1
                res = str(tmpSum-2)+res
                # print(res)
            else:
                carry = 0
                res = str(tmpSum)+res
            pos += 1
        if pos >= lengthA:
            if carry == 0:
                res = b[0:lengthB-pos]+res
            else:
                while pos < lengthB:
                    # print(b[lengthB-1-pos])
                    if int(b[lengthB-1-pos])+carry == 2:
                        carry = 1
                        res = "0"+res
                    else:
                        carry = 0
                        res = b[0:lengthB-pos-1]+"1"+res
                        break
                    pos += 1
        else:
            if carry == 0:
                res = a[0:lengthA-pos]+res
            else:
                while pos < lengthA:
                    # print(a[lengthA-1-pos])
                    if int(a[lengthA-1-pos])+carry == 2:
                        carry = 1
                        res = "0"+res
                    else:
                        carry = 0
                        res = a[0:lengthA-pos-1]+"1"+res
                        break
                    pos += 1
        if carry == 1:
            res = "1"+res
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


