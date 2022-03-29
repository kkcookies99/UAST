 class Solution(object):
    def copy(self,list):
        newList=[]
        for val in list:
            newList.append(val)
        return newList

    def XXX(self, nums):
        resList = []
        for tmp in nums:
            #选一个加入列表
            newList = []
            newList.append(tmp)
            #退出递归
            if len(nums)==1:
                resList.append(newList)
                return resList
            #获取位置
            index=nums.index(tmp)
            #删除当前元素
            nums.remove(tmp)
            appendList= self.XXX(nums)
            #恢复当前元素
            nums.insert(index,tmp)
            #将当前元素添加到答案中
            for append in appendList:
                tmpList=self.copy(newList)
                tmpList.extend(append)
                resList.append(tmpList)
        return resList

