class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==1:
            return nums[0]
        else:
            zuida = -100000
            max_negative = -100000
            temporary = 0
            is_first = True
            for num in nums:
                if is_first:
                    if num >= 0:
                        temporary = num
                        zuida = temporary if temporary > zuida else zuida
                        is_first = False
                    else:
                        max_negative = num if num>max_negative else max_negative    
                else:
                    if num < 0:
                        # if max+num > 0:
                        temporary  += num
                    else:
                        if temporary > 0:
                            temporary += num
                            zuida = temporary if temporary > zuida else zuida
                        else:
                            temporary = num
                            zuida = temporary if temporary > zuida else zuida
                    
                    
            if is_first:
                return max_negative
            else:
                
                return zuida

                

