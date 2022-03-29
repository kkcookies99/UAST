 class Solution {
public:
     bool XXX(TreeNode* root) {
        if (root == NULL) {
            return true;
        }
        
        queue<TreeNode*> queue;
        queue.push(root->left);
        queue.push(root->right);

        while (!queue.empty()) {
            TreeNode* node1 = queue.front();
            queue.pop();
            TreeNode* node2 = queue.front();
            queue.pop();
            if (node1 == NULL && node2 == NULL) {
                continue;
            }
            if (node1 == NULL || node2 == NULL || node1->val != node2->val) {
                return false;
            }
            queue.push(node1->left);
            queue.push(node2->right);
            queue.push(node1->right);
            queue.push(node2->left);
        }

        return true;
    }
};

