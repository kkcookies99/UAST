class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """

        if len(nums) == 0:
            return [[]]

        ans, aprt_ans = [[]], [[]]
        while len(aprt_ans[0]) < len(nums):
            tmp_list = []
            for num in nums:
                for tmp in aprt_ans:
                    if num not in tmp:
                        tmp_srd = sorted(tmp + [num])
                        if tmp_srd not in tmp_list:
                            tmp_list.append(tmp_srd)
            ans += tmp_list[:]
            aprt_ans = tmp_list
        return ans

