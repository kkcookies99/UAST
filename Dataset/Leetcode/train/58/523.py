class Solution:
    def XXX(self, s: str) -> int:
        length_array = s.split(" ")
        for i in length_array[::-1]:
            if i != "":
                return len(i)

