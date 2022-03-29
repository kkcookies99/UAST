 class Solution:
    def XXX(self, nums: 'List[int]') -> 'List[List[int]]':
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) == 0:return []

        result_lenght1 = [[i] for i in range(len(nums))]
        result = [result_lenght1]

        for sub_length in range(1, len(nums)):
            cur_length_result = []
            for i in range(len(result[sub_length - 1])):
                max_num = result[sub_length - 1][i][-1]
                if max_num + 1 >= len(nums): continue
                for j in range(max_num + 1, len(nums)):
                    cur_result = result[sub_length - 1][i].copy()
                    cur_result.extend([j])
                    cur_length_result.append(cur_result)
            result.append(cur_length_result)

        return_result = [[]]
        for i in range(len(result)):
            for j in range(len(result[i])):
                cur_result = []
                for num in result[i][j]:
                    cur_result.append(nums[num])
                return_result.append(cur_result)

        return return_result

