 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        bool flag = false;

        function<void(TreeNode*,int)> Calcu = [&](TreeNode* pNode, int currentSum){
            if(flag || !pNode)
                return;
            
            currentSum += pNode->val;
            if(currentSum == targetSum && !pNode->left && !pNode->right){
                flag = true;
                return;
            }
                
            Calcu(pNode->left, currentSum);
            Calcu(pNode->right, currentSum);
        };

        Calcu(root, 0);

        return flag;
    }
};

