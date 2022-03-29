class Solution:
    def XXX(self, a: str, b: str) -> str:
        list_a = list(a)
        list_b = list(b)
        for i in range(len(list_a)):
            list_a[i] = int(list_a[i])
        for i in range(len(list_b)):
            list_b[i] = int(list_b[i])
        while len(list_a) != len(list_b):
            if len(list_a) < len(list_b):
                list_a.insert(0, 0)
            elif len(list_a) > len(list_b):
                list_b.insert(0, 0)

        list_c = []
        for i in range(len(list_a)):
            list_c.append(list_a[i] + list_b[i])

        p = len(list_c) - 1
        while p >= 0:
            if list_c[p] > 1:
                list_c[p] -= 2
                if p - 1 >= 0: 
                    list_c[p - 1] += 1
                else:
                    list_c.insert(0, 1)
            p -= 1

        for i in range(len(list_c)):
            list_c[i] = str(list_c[i])

        result = ''.join(list_c)
        return result

