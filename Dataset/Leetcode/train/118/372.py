 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []
        else:
            yh_tri = []
            base_ls = [0, 1, 0]
            for i in range(numRows):
                if i == 0:
                    yh_tri.append([1])
                else:
                    new_ls = []
                    for j in range(i+1):
                        new_ls.append(base_ls[j] + base_ls[j + 1])
                    print(new_ls)
                    yh_tri.append(new_ls[0:])
                    new_ls.insert(0, 0)
                    new_ls.append(0)
                    base_ls = new_ls
            return yh_tri

