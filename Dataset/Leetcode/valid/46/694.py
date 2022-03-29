 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        selection_list = nums[:]
        self.backtrack(selection_list, res, [])
        return (res)

    def backtrack(self, selection_list, path_list, path):
        if len(selection_list) == 0:
            path_list.append(path)
            return
        
        for i in range(len(selection_list)):
            path.append(selection_list[i])
            previous_node = selection_list.pop(i)
            self.backtrack(selection_list, path_list, path[:])
            path.remove(previous_node)
            selection_list.insert(i, previous_node)


