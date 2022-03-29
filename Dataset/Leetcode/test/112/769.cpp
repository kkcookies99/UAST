 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (root == NULL) return false;
        stack<TreeNode*> node_stack;
        stack<int> num_stack;
        node_stack.push(root);
        num_stack.push(sum - root->val);

        while (!node_stack.empty()){
            TreeNode* node = node_stack.top();
            node_stack.pop();
            int cur_num = num_stack.top();
            num_stack.pop();

            if (node->left == NULL && node->right == NULL && cur_num == 0){
                return true;
            }
            if (node->left != NULL){
                node_stack.push(node->left);
                num_stack.push(cur_num - node->left->val);
            }
            if (node->right != NULL){
                node_stack.push(node->right);
                num_stack.push(cur_num - node->right->val);
            }
        }
        return false;
    }
};

