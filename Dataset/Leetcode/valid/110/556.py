class Solution(object):
    def XXX(self, root):
        self.res = True
        def search_depth(node):
            if not node:
                return 0
            left_depth = search_depth(node.left) + 1
            right_depth = search_depth(node.right) + 1
            ans = abs(left_depth - right_depth)
            if ans > 1:
                self.res = False
                return 0
            return max(left_depth, right_depth)
        search_depth(root)
        return self.res
        

