 class Solution:
    def __init__(self):
        self.queue = []
        self.res = []

    def XXX(self, root):
        if not root:
            return []
        self.queue = [[root,1]]
        self.compute()
        return self.res

    def compute(self):
        while len(self.queue)>0:    
            head = self.queue.pop(0)
            if head[1]>len(self.res):
                self.res.append([head[0].val])
            else:
                self.res[-1].append(head[0].val)
            if head[0].left:
                self.queue.append([head[0].left, head[1]+1])
            if head[0].right:
                self.queue.append([head[0].right, head[1]+1])

