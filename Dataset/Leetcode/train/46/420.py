 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def rt_help(ls,first):
            if first >= n:
                return_ls.append(ls[:])  <<-- this line
            for i in range(n):
                if marked[i] != 1:
                    ls.append(nums[i])
                    marked[i] = 1

                    rt_help(ls,first+1)
                    marked[i] = 0
                    ls.pop()

        return_ls = []
        ls = []
        n = len(nums)
        marked = [0] * n 
        first = 0
        rt_help(ls,first)
        return return_ls

