 class Solution {
public:
    /*vector<int> res;
    vector<int> XXX(TreeNode* root) {
        dfs(root);
        return res;
    }
    void dfs(TreeNode* root) {
        if(root == NULL) return;
        dfs(root->left);
        res.push_back(root->val);
        dfs(root->right);
    }*/
    //迭代
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> sta;
        vector<int> res;
        TreeNode *cur_node = root;
        while(!sta.empty() || cur_node) {
            //找左子点
		    while(cur_node) {
                sta.push(cur_node);
                cur_node = cur_node->left;
		    }
		    if(!sta.empty()) {
                cur_node = sta.top();
                res.push_back(cur_node->val);
                sta.pop();
                cur_node = cur_node->right;
		    }
        }
        return res;
    }
};

