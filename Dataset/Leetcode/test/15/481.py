 class Solution(object):
    def XXX(self, nums):
        len_nums = len( nums)
        # 排除无法运算的情况
        if len_nums < 3:
            return []
        nums.sort()
        # 排除肯定无解的情况
        if nums[ 0] > 0 or nums[ len_nums - 1] < 0:
            return []
        answer = []
        for icount_1 in range( 0, len_nums - 2):
            if icount_1 > 0 and nums[ icount_1 - 1] == nums[ icount_1]:
                continue
            if nums[ icount_1] > 0:
                # 这里直接返回即可
                return answer
            icount_2 = icount_1 + 1
            icount_3 = len_nums - 1
            while icount_2 < icount_3:
                if nums[ icount_2] + nums[ icount_3] > -nums[ icount_1]:
                    icount_3 -= 1
                elif nums[ icount_2] + nums[ icount_3] < -nums[ icount_1]:
                    icount_2 += 1
                else:
                    answer.append( [ nums[ icount_1], nums[ icount_2], nums[ icount_3]])
                    icount_2 += 1
                    icount_3 -= 1
                    while icount_2 < icount_3 and nums[ icount_2] == nums[ icount_2 - 1]:
                        icount_2 += 1
                    while icount_2 < icount_3 and nums[ icount_3] == nums[ icount_3 + 1]:
                        icount_3 -= 1
        return answer 

