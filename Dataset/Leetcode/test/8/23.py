# 深学渣 练习python
def Is_num(a):
    if(ord(a) <= ord("9") and ord(a) >= ord("0")):
        return True
    else:
        return False
def str_to_int():
    s = input("请输入字符串:")
    sl = []
    tape = 1
    is_num = 0
    result = ""
    # 放入数组
    for item in s:
        sl.append(item)
    # 提取数字
    for temp in range(0,len(sl)):
        if(sl[temp] == " " or sl[temp] == "+"):
            continue
        elif(sl[temp] == "-" and tape == 1):
            tape = -1
            continue
        elif(Is_num(sl[temp])):
            is_num = 1
            result = result + sl[temp]
        else:
            break
    # 处理提取的数字
    if(is_num == 1):
        result = int(result) * tape
        # 整数截断处理
        max = (2**31) - 1
        min = (-1) * (2**31)
        if(result < min):
            result = min
        if(result > max):
            result = max
        print(result)
    else:
        print("0")
str_to_int()

