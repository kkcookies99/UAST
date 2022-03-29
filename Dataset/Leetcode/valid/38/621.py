 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """

        if n == 1:
            print("1")
            return "1"

        word_stack = []
        count = 0
        res_str = ""
        pre_string = self.XXX(n - 1)
        # pre_string_list = list(pre_string)

        for i in range(len(pre_string)):  # 1  11  21
            if not word_stack:
                word_stack.append(pre_string[i])
            if pre_string[i] not in word_stack:
                res_str += (str(count) + pre_string[i - 1])
                word_stack.pop(0)
                word_stack.append(pre_string[i])
                count = 0
            count += 1
        res_str += (str(count) + pre_string[-1])

        print(res_str)
        return res_str

