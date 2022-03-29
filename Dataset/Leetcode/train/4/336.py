 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        # 1. 组合2个列表，并排序
        num_all = nums1 + nums2
        num_all.sort()

        # 【特殊情况】：组合列表长度为0，即2个列表都空（根据提示，没有这个情况）
        # if len(num_all) == 0:
        #     return float(0)

        # 2. 判断组合列表长度的奇偶性
        if len(num_all) % 2 == 0:
            # 3. 若偶数，则有2个元素组成中位数（取整//2得到索引位置）
            first = len(num_all) // 2 - 1
            second = len(num_all) // 2
            return (num_all[first] + num_all[second]) / 2
        else:
            # 4. 若奇数，则只有1个元素（取整//2得到索引位置）
            first = len(num_all) // 2
            return num_all[first]

