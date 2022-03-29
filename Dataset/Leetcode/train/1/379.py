 class Solution:
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        maps = {}
        for i in range(len(nums)):
            result = target - nums[i]
            if result in maps:
                if maps[result] != i:
                    return [maps[result], i ]
            maps[nums[i]] = i
                   


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


