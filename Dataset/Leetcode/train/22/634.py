 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """

        res = []
        def helper(path, left_count, right_count):
            if right_count<left_count:
                return

            if not left_count and not right_count:
                res.append(path)

            if left_count > 0:
                helper(path + '(', left_count - 1, right_count)

            if right_count > 0:
                helper(path + ')', left_count, right_count - 1)

        helper('', n, n)

        return res

