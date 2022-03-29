 class Solution:
    def XXX(self, s: str) -> bool:
        # queue = []
        # left = ["(", "{", "["]
        # pair = {"}": "{", "]": "[", ")": "("}
        # for item in s:
        #     if item in left:
        #         queue.append(item)
        #     else:
        #         if len(queue) == 0:
        #             return False
        #         else:
        #             temp = queue.pop()
        #             if temp == pair[item]:
        #                 continue
        #             else:
        #                 return False
        # if len(queue) != 0:
        #     return False
        # return True
        while '{}' in s or '()' in s or '[]' in s:
            s = s.replace('{}', '')
            s = s.replace('[]', '')
            s = s.replace('()', '')
        return s == ''

