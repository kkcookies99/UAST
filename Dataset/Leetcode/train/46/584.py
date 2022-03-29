 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        ans = []
        path_stack = [[]]
        choice_stack = [nums]

        while(len(choice_stack)>0):
            path = path_stack.pop(-1)
            choice = choice_stack.pop(-1)
            if(len(choice)==0):
                ans.append(path)
                continue
            for i in range(len(choice)):
                new_path = path + [choice[i]]
                new_choice = choice[:]
                new_choice.pop(i)
                path_stack.append(new_path)
                choice_stack.append(new_choice)
        return ans

