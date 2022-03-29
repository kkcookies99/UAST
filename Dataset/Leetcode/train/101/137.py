 class Solution(object):
    def XXX(self, root):
        if not root:
            return True
        
        arr = [root.left, root.right]
        while arr:
            i, j = 0, len(arr) - 1
            leftArr, rightArr = [], []
            while i < j:
                if arr[i] or arr[j]:
                    if not arr[i] or not arr[j] or arr[i].val != arr[j].val:
                        return False
                i += 1
                j -= 1
            # 这一层已经是对称的了，遍历下一层
            newArr = []
            for node in arr:
                if node:
                    newArr.append(node.left)
                    newArr.append(node.right)
            arr = newArr
        return True

