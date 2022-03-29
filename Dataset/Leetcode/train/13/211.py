class Solution:
    def XXX(self, s: str) -> int:
        first_pointer = 0
        sd_pointer = 1
        my_dict = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        length = len(s)
        output_num = 0
        if len(s) == 1:
            return my_dict[s[first_pointer]]
        while first_pointer < length:
            if my_dict[s[first_pointer]] >= my_dict[s[sd_pointer]]:
                output_num += my_dict[s[first_pointer]]
                first_pointer += 1
                sd_pointer += 1 if sd_pointer < length - 1 else 0
            else:
                output_num += my_dict[s[sd_pointer]] - my_dict[s[first_pointer]]
                first_pointer += 2
                sd_pointer += 2 if sd_pointer+2 < length else 1
        return output_num

