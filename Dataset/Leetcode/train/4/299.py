 class Solution:
        def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        tmp_ls = []
        middle = 0.0
        tmp_ls.extend(nums1)
        tmp_ls.extend(nums2)
        # print(tmp_ls)
        tmp_ls.sort()
        # print(tmp_ls)

        x, y = divmod(len(tmp_ls) ,2)
        # print(x, y)

        if y == 0:
            middle = (tmp_ls[x] + tmp_ls[x-1])/2
        else:
            middle = tmp_ls[x]
        # print("middle = {}".format(middle))
        return middle

