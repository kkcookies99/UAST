 class Solution:

    def XXX(self, n: int) -> List[str]:
        lp = "("
        rp = ")"
        totalStep = n * 2
        arr = []
        cursum = 0
        ans = []

        def dfs(cursum, leftRemain, rightRemain):
            #print(arr, cursum)
            if leftRemain == 0 and rightRemain == 0 and cursum == 0:
                success = ""
                for ch in arr:
                    success += ch
                ans.append(success)
                return
            for tmp in [(lp, 1), (rp, -1)]:
                if leftRemain == 0 and tmp[1] == 1:
                    continue
                if rightRemain == 0 and tmp[1] == -1:
                    continue
                if cursum + tmp[1] > n:
                    continue
                if cursum + tmp[1] < 0:
                    continue
                arr.append(tmp[0])
                cursum += tmp[1]
                if tmp[1] == 1:
                    dfs(cursum, leftRemain - 1, rightRemain)
                else:
                    dfs(cursum, leftRemain, rightRemain - 1)
                arr.pop()
                cursum -= tmp[1]
            return

        dfs(0, n, n)

        return ans```

