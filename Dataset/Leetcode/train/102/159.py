class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:return []
        ans,tem_list,tag,stack = [],[],0,[(root,0)]
        while stack:
            p,lev = stack.pop(0)
            if lev == tag+1:
                ans.append(tem_list)
                tem_list = [p.val]
                tag += 1
            else:
                tem_list.append(p.val)
            if p.left:
                stack.append((p.left,lev+1))
            if p.right:
                stack.append((p.right,lev+1))
        ans.append(tem_list)  
        return ans

