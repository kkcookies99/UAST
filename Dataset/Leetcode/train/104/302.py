def XXX(self, root):
        if root is None:
            return 0
        level = 0
        stack = [root]
        while stack:
            level += 1  # 每下一层，层数+1
            n = len(stack)
            # 拿到当前层下一层全部节点到队列
            for i in range(n):
                if stack[i].left:
                    stack.append(stack[i].left)
                if stack[i].right:
                    stack.append(stack[i].right)
            stack = stack[n:]   # 删除上一层节点
        return level

