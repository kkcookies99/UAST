 class Solution {
public:
    bool XXX(TreeNode* root) {
        TreeNode* pred = nullptr;
        TreeNode* predecessor = nullptr;

        while (root != nullptr) {
            //root有左孩子
            if (root->left != nullptr) {
                //找到左子树的最右节点
                predecessor = root->left;
                while (predecessor->right != nullptr && predecessor->right != root) {
                    predecessor = predecessor->right;
                }

                //如果predecessor的右孩子为空，则让predecessor的右孩子指向root
                //然后访问root的左孩子，即：root = root->left;
                if (predecessor->right == nullptr) {
                    predecessor->right = root;
                    root = root->left;
                }
                //如果predecessor的右孩子不为空，则此时predecessor->right一定为root，
                //这说明root的左子树已经遍历完了，这个时候我们要断开链接，即将
                //predecessor置空，然后遍历root的右子树
                else {
                    //每个点都会遍历到这里，对每个点的操作也在这里
                    if (pred != nullptr && root->val < pred->val) {
                        return false;
                    }
                    //前驱节点在这里赋值
                    pred = root;
                    predecessor->right = nullptr;
                    root = root->right;
                }
            }
            //访问root的右孩子
            else {
                //每个点都会遍历到这里，对每个点的操作也在这里
                if (pred != nullptr && root->val < pred->val) {
                    return false;
                }
                //前驱节点在这里赋值
                pred = root;
                root = root->right;
            }
        }

        return true;
    }
};

