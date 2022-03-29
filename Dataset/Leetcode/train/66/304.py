 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        num = ''.join(map(str, digits))
        result = map(int, str(int(num) + 1))
        return list(result)

