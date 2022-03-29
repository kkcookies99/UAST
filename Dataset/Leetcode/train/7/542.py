 class Solution:
#在Python内部对整数的处理分为普通整数和长整数，普通整数长度为机器位长，通常都是32位，超过这个范围的整数就自动当长整数处理，而长整数的范围几乎完全没限制。
    def XXX(self, x: int) -> int:
        result = int(str(x)[::-1]) if x>0 else -int(str(abs(x))[::-1])
        result = 0 if result>=2147483647 or result<=-2147483648 else result
        return result

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


