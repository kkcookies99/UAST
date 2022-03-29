 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
       	if (!root) return false;
       	
       	sum -= root->val;
       	//提前判断该节点是不是叶子节点，如果再递归深入的话 有可能导致错误 
        if (!root->left && !root->right && sum == 0) return true; 
        
        return XXX(root->left, sum) || XXX(root->right, sum);
    }
};

