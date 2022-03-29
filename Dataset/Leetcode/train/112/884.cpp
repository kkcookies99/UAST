 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
         if(root==nullptr)return false;
        queue<TreeNode *> queue;
        queue.push(root);
        while(!queue.empty())
        {
            TreeNode *cur_node=queue.front();
            queue.pop();
            if(cur_node->left==nullptr&&cur_node->right==nullptr&&cur_node->val==sum)
                return true;
            if(cur_node->left!=nullptr)
            {
                cur_node->left->val+=cur_node->val;
                queue.push(cur_node->left);
            }
            if(cur_node->right!=nullptr)
            {
                cur_node->right->val+=cur_node->val;
                queue.push(cur_node->right);
            }
       }
        return false;
    }
};

