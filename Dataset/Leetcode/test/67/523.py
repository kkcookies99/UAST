class Solution:
    def XXX(self, a: str, b: str) -> str:
        if len(a)<=10**4 and  len(a) >= 1 and  len(b) <= 10**4 and len(b) >= 1:
            # int(a,2):是将其它进制的数转化为十进制，输入两个参数，第一个是输入的值，第二的是进制
            ##         这里表示二进制数
            # bin():是将整数转化为二进制，只有一个参数,返回的是一个以0b开头的字符串,从索引为2开始取              ##       得到二进制数
            return bin(int(a,2)+int(b,2))[2:]  

