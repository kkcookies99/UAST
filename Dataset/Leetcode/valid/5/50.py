def p_h(a):
    b = ""
    for item in range(1,len(a)+1):
        b = b + a[-item]
    if(a == b):
        return True
    return False
def XXX():
    s = input("请输入字符串:")
    t = ""

    if(s == ""):
        print("")
        return
    result = s[0]
    M = 1
    for item in range(0,len(s)):
        t = s[item]
        k = 1
        if(item != len(s)-1):
            for temp in range(item+1,len(s)):
                t = t + s[temp]
                k = k + 1
                if(p_h(t)):
                    if(k > M):
                        M = k
                        result = t
        else:
            if(p_h(t)):
                if(k > M):
                    M = k
                    result = t
    print(result)


