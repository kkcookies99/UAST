 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        num = ''
        for i in digits:
            num = num + str(i)
        new_num = str(int(num) + 1)
        res = []
        for i in range(len(new_num)):
            res.append(int(new_num[i]))
        return res

