 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        bool state = true;
        if(!p && !q) return true; // 当前节点都是空
        if(!p || !q) return false; // 当前节点一个是空，一个不是空
        if(p -> val != q -> val) return false; // 当前节点都不为空，但值不相等
        else {
            return XXX(p -> left, q -> left) && XXX(p -> right, q -> right);
        }
        return true;
    }
};

