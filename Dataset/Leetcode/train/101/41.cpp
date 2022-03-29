 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr)
            return true;
        queue<TreeNode*> q1, q2;
        q1.push(root->left);
        q2.push(root->right);
        
        while(!q1.empty() && !q2.empty()){
            TreeNode *node1 = q1.front();
            TreeNode *node2 = q2.front();
            q1.pop();
            q2.pop();

            if(node1 == nullptr ^ node2 == nullptr)
                return false;
            if(node1 == nullptr && node2 == nullptr)
                continue;
            if(node1->val != node2->val)
                return false;

            TreeNode *left1 = node1->left, *right1 = node1->right;
            TreeNode *left2 = node2->left, *right2 = node2->right;

            if(left1 == nullptr ^ right2 == nullptr ||
            left2 == nullptr ^ right1 == nullptr)
                return false;

            if(left1 != nullptr && right2 != nullptr &&
            left1->val != right2->val)
                return false;

            if(left2 != nullptr && right1 != nullptr &&
            left2->val != right1->val)
                return false;

            if(left1 != nullptr)
                q1.push(left1);
            if(right2 != nullptr)
                q2.push(right2);
            if(left2 != nullptr)
                q1.push(left2);
            if(right1 != nullptr)
                q2.push(right1);
        }
        return true;
    }
};

