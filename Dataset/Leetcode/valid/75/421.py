 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        l = len(nums)
        if l < 2: return
        a, b, c = 0, l, None
        while a<b:
            if nums[a] == 0:
                if c is None:
                    if a == 0:
                        c = a
                    else:
                        c = 0
                        nums[c], nums[a] = nums[a], nums[c]
                elif c == a-1:
                    c = a
                else:
                    c = c+1
                    nums[c], nums[a] = nums[a], nums[c]
                a += 1
                continue
            elif nums[a] == 1:
                a += 1
                continue
            #
            while a<b:
                if nums[b-1] == 2:
                    b -= 1
                else:
                    nums[a], nums[b-1] = nums[b-1], nums[a]
                    b -= 1
                    break

