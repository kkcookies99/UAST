 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        stack<pair<TreeNode*, int>> mystack;
        mystack.push(make_pair(root, sum));
        TreeNode* node;
        int value;

        while(!mystack.empty()){
            node = mystack.top().first;
            value = mystack.top().second;
            mystack.pop();

            if(!node)
                continue;
            if(!node->left && !node->right && node->val == value)
                return true;
            
            mystack.push(make_pair(node->left, value - node->val));
            mystack.push(make_pair(node->right, value - node->val));
        }

        return false;
    }
};

