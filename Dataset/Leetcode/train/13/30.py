class Solution:
    def XXX(self, s: str) -> int:
        total_sum = 0
        Romans_dic={'I': 1, 'V': 5, 'X': 10, 'L':50, 'C':100, 'D':500, 'M':1000}

        for i in range(len(s)):
            total_sum = Romans_dic[s[i]] + total_sum
            if(i > 0):
                if(s[i-1] == 'I' and (s[i] == 'V' or s[i] == 'X')):
                    total_sum = total_sum - 2
                elif(s[i-1] == 'X' and (s[i] == 'L' or s[i] == 'C')):
                    total_sum = total_sum - 20
                elif(s[i-1] == 'C' and (s[i] == 'D' or s[i] == 'M')):
                    total_sum = total_sum - 200

        return total_sum


