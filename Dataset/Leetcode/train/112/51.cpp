class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (root == NULL)
            // 判断空结点
            return false;

        int val = root -> val;

        if (root -> left == NULL && root -> right == NULL && val == sum)
            // 判断叶子结点
            return true;
        
        if (root -> left == NULL && root -> right == NULL && val != sum)
            // 判断叶子结点
            return false;
        
        else
            // 判断非叶子结点
            return (XXX(root -> left, sum - val) || 
                    XXX(root -> right, sum - val));
       
    }
};

