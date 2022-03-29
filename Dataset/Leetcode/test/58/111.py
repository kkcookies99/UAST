 class Solution(object):
     def XXX(self, s):
        new_s = s.split(" ")
        while True:
            if s is None:
                return 0
            elif len(new_s) > 1 and new_s[len(new_s) - 1] == '':
                new_s.pop(len(new_s) - 1)
            else:
                return len(new_s[len(new_s) - 1])

