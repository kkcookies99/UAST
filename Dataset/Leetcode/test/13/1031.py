 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        word_dict = {}
        word_dict['I'] = 1
        word_dict['V'] = 5
        word_dict['X'] = 10
        word_dict['L'] = 50
        word_dict['C'] = 100
        word_dict['D'] = 500
        word_dict['M'] = 1000

        previous_num = ''

        ans = 0

        for char in s:
            if previous_num == '':
                ans = ans + word_dict[char]
                
            elif word_dict[char] > word_dict[previous_num]:
                ans = ans + word_dict[char] - 2 * word_dict[previous_num]
                
            else:
                ans = ans + word_dict[char]
            
            previous_num = char
        
        return ans

