class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []  
        path = []  
        def backtrack(nums,startIndex):
            res.append(path[:])  #收集子集，要放在终止添加的上面，否则会漏掉自己
            for i in range(startIndex,len(nums)):  #当startIndex已经大于数组的长度了，就终止了，for循环本来也结束了，所以不需要终止条件
                path.append(nums[i])
                backtrack(nums,i+1)  #递归
                path.pop()  #回溯
        backtrack(nums,0)
        return res

