def XXX(self, a: List[int], b: List[int]) -> float:
        assert len(a) > 0 or len(b) > 0
        _min = a[0] if len(b) == 0 or (len(a) > 0 and a[0] <= b[0]) else b[0]
        _max = a[-1] if len(b) == 0 or (len(a) > 0 and a[-1] >= b[-1]) else b[-1]

        if len(a) > len(b):
            a, b = b, a

        # inserting pairs of minimum value and maximum value does not change the median
        a.insert(0, _min); b.append(_max)
        b.insert(0, _min); b.append(_max)
        na = len(a)
        nb = len(b)
        n = (na + nb) // 2
        ia = 0
        ib = n - 2
        step = na - 1
        while ia < na - 1 and a[ia] < b[ib]:
            while step and (ia + step >= na or a[ia + step] >= b[ib - step]):
                # if step is too big
                step = step // 2
            step = step or 1
            ia += step
            ib -= step
        # ia is na - 1, or the first value which makes a[ia] >= b[ib]

        if b[ib + 1] < a[ia]:
            ib += 1
            ia -= 1
        # a[:ia+1] and b[:ib+1] are the first n numbers

        # get the nth number
        x = a[ia] if a[ia] >= b[ib] else b[ib]

        # get the (n+1)th number
        ia += 1
        ib += 1
        y = b[ib] if ia >= na or b[ib] <= a[ia] else a[ia]

        if (na + nb) % 2:
            return y
        else:
            return (x + y) / 2