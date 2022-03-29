 class Solution {
public:
    bool XXX(TreeNode* p, int& height) {//height记录当前结点的高
        if(p == nullptr) {
            height = 0;
            return true;
        }
        
        int hl, hr;//左、右子树高
        if(!XXX(p->left, hl)) return false;//左子树不平衡
        if(!XXX(p->right, hr)) return false;//右子树不平衡
        if(abs(hl - hr) > 1) return false;//当前根结点的树不平衡
        height = (hl > hr ? hl : hr) + 1;//当前根结点高
        return true;
    }
    bool XXX(TreeNode* root) {
        int h;
        return XXX(root, h);
    }
};

