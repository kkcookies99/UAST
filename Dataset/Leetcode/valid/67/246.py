 class Solution:
    def XXX(self, a: str, b: str) -> str:
        tmp = 0
        i = 0
        j = 0

        len_a = len(a)
        len_b = len(b)

        result = ""
        while i < len_a or j < len_b or tmp:
            val_a = int(a[len_a-i-1]) if i < len_a else 0
            val_b = int(b[len_b-j-1]) if i < len_b else 0 
            val = (val_a + val_b + tmp) % 2
            tmp = (val_a + val_b + tmp) // 2
            
            result += str(val) 
            i += 1
            j += 1
           
        return result[::-1]

