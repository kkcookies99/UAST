 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        queue<TreeNode*> queueNode;
        if(!root)   return false;
        if((!(root->left)) && (!(root->right)) && (root->val == targetSum))  
            return true;
        else
        {
            root->val = targetSum - root->val;
            queueNode.push(root);
        }
        while(!queueNode.empty()){
            int size = queueNode.size();
            for(int i = 0; i < size; i++) {
                TreeNode* cur = queueNode.front();
                queueNode.pop();
                if(cur->left && (cur->val - cur->left->val == 0) && (!(cur->left->left)) && (!(cur->left->right)))   
                    return true;
                else if(cur->left)
                {
                    cur->left->val = cur->val - cur->left->val;
                    queueNode.push(cur->left);
                }
                if(cur->right && (cur->val - cur->right->val == 0) && (!(cur->right->left)) && (!(cur->right->right)))   return true;
                else if(cur->right)
                {
                    cur->right->val = cur->val - cur->right->val;
                    queueNode.push(cur->right);
                }
            }  
        }
        return false;
    }
};

