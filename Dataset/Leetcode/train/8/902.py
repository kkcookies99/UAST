 class Solution:
    def XXX(self, str: str) -> int:
        length=len(str)
        res = 0
        flag = 1
        counter = 0
        hashmap={"0","1","2","3","4","5","6","7","8","9"}
        print(hashmap)
        for i in range(length):
            if(str[i]==" "):
                if (counter !=0):
                    break
                continue
            if(str[i] not in hashmap and str[i]!="+" and str[i] !="-"):
                break
            elif (str[i] == "-"):
                if(counter !=0):
                    break
                counter = 1
                flag=-1
                continue
            elif (str[i] == "+"):
                if(counter !=0):
                    break
                counter = 1
                continue
            else:
                counter = 1
                res = res*10 +int(str[i])
        print(res)
        res=res*flag
        if (res<-2147483648):
            return -2147483648
        if (res>2147483647):
            return 2147483647
        return res

