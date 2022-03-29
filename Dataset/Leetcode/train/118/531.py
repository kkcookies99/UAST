 class Solution:
    def XXX(self, n):
        tri = []

        for i in range(n):

            num_2 = [1] * (i + 1)  #可以直接生成n = 0, 1的情况

            if i >= 2:
                for j in range(i+1):
                    num_1 = tri[i - 1]
                    if j == 0 or j == i:
                        continue
                    else:
                        num_2[j] = num_1[j-1] + num_1[j]

            tri.append(num_2)

        return tri

