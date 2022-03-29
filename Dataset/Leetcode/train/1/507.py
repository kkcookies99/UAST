 class Solution:
    def XXX(self, num, target):
        dic = {}
        for i in range(len(num)):
            dic.update({i:num[i]})
        for i in range(len(num)):
            del dic[i]
            if target - num[i] in dic.values() :
                return [i,list(dic.values()).index(target-num[i])+1+i]
                break



if __name__ == '__main__':
    num = [3, 2, 4, 7]
    target = 6
    answer = Solution().XXX(num, target)
    print(answer)


