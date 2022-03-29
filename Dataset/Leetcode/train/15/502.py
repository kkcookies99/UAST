 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        nums_len = len(nums)
        ans = set()

        for i in range(0, nums_len):
            i_num = nums[i]
            # 排好序，i为三数的起始，且目标和要为0，
            # 如果i>0，则后面的两个数也大于0，不满足条件，直接退出即可
            if i_num > 0:
                break
            if i > 0 and i_num == nums[i - 1]:  # 去重
                continue

            # 要找的数从i和j中间挑选，用num_dict来保存i和j中间的数
            num_dict = dict()
            for j in range(i + 1, nums_len):
                j_num = nums[j]

                diff = -(i_num + j_num)
                if num_dict.get(diff, None) is not None:  # 如果i和j中间有数等于diff，则添加到ans里
                    ans.add((i_num, j_num, diff))  # 这里用元组，因为元组可以哈希

                num_dict[j_num] = 1

        return [list(i) for i in ans]

