 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        '''
        使用j从头找不等于val的，即j的右边都是val
        使用i从头遍历，遇到等于val的就跟j的换，即i的左边都是不等于val
        直到i，j相遇
        '''
        l=len(nums)
        

        j=1
        #先定位j
        try:
            while nums[-j] == val :
                j += 1
        except IndexError :
                return 0

        for i in range(l):
                    
            if nums[i] == val :
                nums[i] , nums[-j] = nums[-j] , nums[i]
                j += 1

            #重新定位j
            while nums[-j] == val :
                    j += 1    

            if i + j == l:
                return i+1
            if i + j == l - 1:
                return i+2

