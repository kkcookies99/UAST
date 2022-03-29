 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        for i in range(len(digits)-1, -1, -1):
            digits[i] = (digits[i] + 1) % 10
            if digits[i]:return digits
        return [1]+digits

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


