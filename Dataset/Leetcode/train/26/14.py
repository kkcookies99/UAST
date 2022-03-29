 class Solution(object):
    # noinspection PyMethodMayBeStatic
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0, []
        new_nums = set(nums)
        new_length = len(new_nums)
        return new_length, new_nums


# oneList = [1, 1, 2]
oneList = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
s = Solution()
res = s.XXX(oneList)
print(res)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

