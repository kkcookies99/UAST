 def manacher(s):
    ls = len(s)
    arms = [0] * ls
    j = right = 0
    for i in range(1, ls):
        l = r = i
        if right >= i:
            arm = arms[2 * j - i]
            if i + arm < right:
                arms[i] = arm
                continue
            arm = min(right-i, arm)
            l, r = i - arm, i + arm
        while l >= 0 and r < ls and s[l] == s[r]:
            l -= 1
            r += 1
        arms[i] = arm = (r - l - 2) // 2
        # 这里可以根据需要取 arm 最大值
        if r - 1 > right:
            j = i
            right = r - 1
    return arms

