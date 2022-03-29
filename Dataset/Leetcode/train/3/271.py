 def XXX(self, s: str) -> int:
    res = []
    max_length = 0
    for i in s:
        if i not in res:
            res.append(i)
        else:
            current_length = len(res)
            if max_length < current_length:
                max_length = current_length
            index = res.index(i)
            res = res[index+1:]
            res.append(i)
    return max_length if max_length >= len(res) else len(res)
