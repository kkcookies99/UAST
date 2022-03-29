class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        stack = [[[],nums]]
        ret = []
        while stack:
            tmp = stack.pop()
            if len(tmp[1]) == 1:  # 只有一个未遍历点说明已经到了遍历的末尾，此次路径已固定，把结果加入ret
                ret.append(tmp[0]+tmp[1])
            else:  # tmp[1]存储未遍历的点，未遍历的多于1个就在未遍历点里面循环选一个入栈
                for index,i in enumerate(tmp[1]): 
                    stack.append([tmp[0]+[i], tmp[1][:index]+tmp[1][index+1:]]) # 剩下的未遍历点放进list中的后一个
        return ret


