 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            yanghuisanjiao = [[1]]
        elif numRows == 2:
            yanghuisanjiao = [[1], [1, 1]]
        else:
            yanghuisanjiao = [[1], [1, 1]]
            for i in range(3, numRows + 1):
                list1 = [1]
                list2 = yanghuisanjiao[-1]
                for j in range(len(list2) - 1):
                    list1.append(list2[j] + list2[j + 1])
                list1.append(1)
                yanghuisanjiao.append(list1)
        return yanghuisanjiao

