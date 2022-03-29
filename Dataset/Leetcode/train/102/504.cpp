class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<TreeNode*> cur_node;
        vector<int> cur_val;
        vector<vector<int>> res;
        cur_node.push_back(root);
        vector<TreeNode*> next_node;
        while(cur_node.size())
        { 
            next_node.clear();
            for(auto node:next_node)
            {
                cur_val.push_back(node->val);
                if(node->left)
                    next_node.push_back(node->left);
                if(node->right)
                    next_node.push_back(node->right);
            }
            res.push_back(cur_val);
            cur_node.clear();
            cur_node = next_node;
        }
        return res;
    }
};

