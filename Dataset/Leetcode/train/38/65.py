class Solution:
    def XXX(self, n: int) -> str:
        arr = ["1"]
        for i in range(n-1):
            tmp = ""
            j = 0
            while j < len(arr[i]):
                num = arr[i][j]
                time = 0
                while j <len(arr[i]) and num == arr[i][j]: 
                    j += 1 # 同上一个相同则继续找
                    time += 1 # 次数加一
                tmp = tmp + str(time) + num
            arr.append(tmp)
        return arr[n-1]

