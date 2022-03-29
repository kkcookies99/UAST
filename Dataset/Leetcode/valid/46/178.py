class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def backtracking() -> None:
            if len(path) == n:
                res.append(path[:])
                return
            for i in range(n):
                if used[i]:
                    continue
                used[i] = True
                path.append(nums[i])
                backtracking()
                path.pop()
                used[i] = False

        res = []
        path = []
        n = len(nums)
        used = [False] * n
        backtracking()
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


