class Solution:
    def XXX(self, root):
        if root == None:
            return []
        queue = [(root, 0)]
        value = []

        i = 0  # 由于没有出队的操作， 因此记录当前队首位置
        level = 0
        while i < len(queue):
            if queue[i][1] == len(value):
                value.append([])
            value[len(value) - 1].append(queue[i][0].val)

            if queue[i][0].left:
                queue.append((queue[i][0].left, queue[i][1] + 1))
            if queue[i][0].right:
                queue.append((queue[i][0].right, queue[i][1] + 1))

            i += 1
            
        return value

