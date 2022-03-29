# 深学渣 练习python
a = []
b = []
while(True):
    k = int(input("请输入第1个链表的数值(如果数值小于0或大于等于10结束):"))
    if(k < 0 or k >= 10):
        break
    a.append(k)
while(True):
    k = int(input("请输入第2个链表的数值(如果数值小于0或大于等于10结束):"))
    if(k < 0 or k >= 10):
        break
    b.append(k)
if(len(a) < len(b)):
    k = a
    a = b
    b = k
for item in range(0,len(b)):
    a[item] += b[item]
k = 0
while(True):
    if(k == len(a)-1):
        break
    if(a[k] >= 10):
        a[k+1] += int(a[k] / 10)
        a[k] = int(a[k] % 10)
    k = k + 1
print(a)
k = len(a)-1
if(a[k] >= 10):
    a.append(int(a[k] / 10))
    a[k] = a[k] % 10
print(a)

