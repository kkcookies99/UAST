class Solution:
    def XXX(self, a: str, b: str) -> str:
        a_len = len(a)
        b_len = len(b)
        a_num = 0
        b_num = 0
        for i in range(a_len-1, -1, -1):
            cifang = i - (a_len - 1)
            if cifang < 0:
                cifang = -cifang
            a_num = a_num + int(a[i])*(2**cifang)
        for i in range(b_len-1, -1, -1):
            cifang = i - (b_len - 1)
            if cifang < 0:
                cifang = -cifang
            b_num = b_num + int(b[i])*(2**cifang)
        total = a_num + b_num
        tes = 1
        aa = total
        new_num = ''
        if total == 1 or total == 0:
            new_num = str(aa % 2)
        else:
            while aa != 1 | 0:
                bb = aa % 2
                aa = aa//2
                new_num = new_num + str(bb)
                tes += 1
            new_num = new_num + '1'
        new_len = len(new_num)
        NEW = ''
        for i in range(new_len-1, -1, -1):
            NEW = NEW + new_num[i]
        return NEW

