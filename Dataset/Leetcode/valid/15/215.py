 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        res = []
        for i in range(n):
            left = i+1
            right = n-1
            while left < right:
                cur_num = nums[left]+nums[right]+nums[i]
                if cur_num == 0:
                    ls = [nums[i], nums[left], nums[right]]
                    res.append(ls)
                    if right - left > 1:
                        left += 1
                        right -= 1
                    elif right - left == 1:
                        break
                elif cur_num > 0:
                    right -= 1
                else:
                    left += 1
        res = list(set([tuple(t) for t in res]))
        res = [list(x) for x in res]
        print(res)
        return res

