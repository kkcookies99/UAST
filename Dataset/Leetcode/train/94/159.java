 class Solution {
    func XXX(_ root: TreeNode?) -> [Int] {
        guard root != nil else {
            return []
        }
        return XXX(root?.left) + [root!.val] + XXX(root?.right)
    }
}

