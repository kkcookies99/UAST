 class Solution:
    def XXX(self, nums):
        nums.sort()
        if nums == []:
            return []
        res = []
        def callback(ls, path, res):
            if ls == []:
                return
            for i in range(len(ls)):
                res.append(path + [ls[i]])
                callback(ls[i+1:], path+[ls[i]], res)
        callback(nums, [], res)
        res.append([])
        return res

