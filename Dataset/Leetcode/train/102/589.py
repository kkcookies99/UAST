class Solution:
    def XXX(self, root):
        nodes,values  = [(root,)],[]
        while nodes:
            values.append([r.val for n in nodes for r in n if r])
            nodes = [(r.left, r.right) for n in nodes for r in n if r]
        return values[:-1]

