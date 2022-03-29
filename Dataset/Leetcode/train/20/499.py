 class Solution:
    def XXX(self, s: str) -> bool:
        dic = {")":"(", "]":"[", "}":"{"}
        d = deque()
        for i in s:
            if i not in dic:
                d.append(i)
            else:
                if len(d) == 0 and i in dic.keys():
                    return False
                if d.pop() != dic.get(i):
                    return False
        return len(d) == 0

