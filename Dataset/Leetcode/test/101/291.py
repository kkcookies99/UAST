 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        dicts = {} # 保存二叉树每一层的元素：key表示层号；value表示该层的元素
        def dicts_init(n):
            if n not in dicts:
                dicts[n] = []
        def recursive(r, n): # 创建递归函数，r表示当前节点，n表示当前节点对应的层号
            if r is None:
                dicts_init(n)
                dicts[n].append(None)
                return None
            dicts_init(n)
            dicts[n].append(r.val) # 在当前层号的位置追加当前节点的值
            recursive(r.left, n+1)  # 依次调用当前节点的左右子节点，同时层号+1
            recursive(r.right, n+1)
        recursive(root, 1) # 调用递归函数，初始层号为1
        for arr in dicts.values(): # 依次求每一层号对应的元素是否对称
            st = 0 
            ed = len(arr) - 1 
            while st <= ed:
                if arr[st] != arr[ed]:
                    return False 
                st +=1 
                ed -= 1 
        return True 

