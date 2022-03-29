class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return str(1)
        count = 1
        result = ''
        temp = self.XXX(n-1)
        for i in range(len(temp)):
            if i == (len(temp)-1):
                result += (str(count) + temp[i])
                return result                
            if temp[i] == temp[i+1]:
                count += 1
                continue
            else:
                result += (str(count) + temp[i])
                count = 1
        

