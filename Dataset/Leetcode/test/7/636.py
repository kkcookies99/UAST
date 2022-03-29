 class Solution:
    def XXX(self, x: int) -> int:
        list_item = [digit for digit in str(x)]
        if list_item[0] == "-":
            list_item.pop(0)
            list_item.append("-")
        list_item.XXX()
        res = int(''.join(list_item))

        if -2147483648 <= res <= 2147483647:
            return res
        return 0

