def XXX():
    s = input("请输入字符串:")
    k = 0
    result = temp = ""
    max = 0
    for item in range(0,len(s)):
        if(s[item] not in temp):
            temp = temp + str(s[item])
            k = k + 1
        else:
            if(max < k):
                result = temp
                max = k
                k = 1
    print(max,result)


