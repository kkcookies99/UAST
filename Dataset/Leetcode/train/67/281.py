 class Solution:
    def XXX(self, a: str, b: str) -> str:
        if len(a) > len(b):
            for i in range(len(a)-len(b)):
                b = list(b)
                b.insert(0,"0")
        if len(a) < len(b):
            for i in range(len(b)-len(a)):
                a = list(a)
                a.insert(0,"0")
        a = list(a[::-1])
        b = list(b[::-1])
        new_list = [0]*(len(a) + 1)
        for i in range(len(a)):
            new_list[i] = int(new_list[i]) + int(a[i]) + int(b[i])
            if new_list[i] >= 2:
                new_list[i] -= 2
                new_list[i+1] += 1
        if new_list[-1] == 0:
            new_list.pop()
        new_list = new_list[::-1]
        new_list = "".join(list(map(str,new_list)))
        return new_list


