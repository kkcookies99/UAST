 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root == nullptr)
            return false;
        return traversal(root, sum);
    }

    bool traversal(TreeNode* root, int& count){
        count -= root->val;
        if(root->left == nullptr && root->right == nullptr){ //递归结束条件遇到叶子节点
            if(count == 0) //判断是否找到路径
                return true;
            else
                return false;
        }

        if(root->left){ //遍历左子树
            bool leftTree = traversal(root->left, count);
            if(leftTree) //判断左子树中是否存在该路径
                return true;
            count += root->left->val; //回溯
        }

        if(root->right){
            bool rightTree = traversal(root->right,count);
            if(rightTree)
                return true;
            count += root->right->val;
        }
        return false;
    }
};

