class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int>> res;
        if(root==NULL)
            return res;
        q.push(root);
        vector<int> layer;
        TreeNode* last = root;
        while(q.size()){
            root = q.front();
            q.pop();
            layer.push_back(root->val);
            if(root->left)
                q.push(root->left);
            if(root->right)
                q.push(root->right);
            if(root==last){
                res.push_back(layer);
                layer.clear();
                last = q.back();
            }
        }
        return res;
    }
};

用一个队列实现，无额外开销，用一个结点指针last指代当前层的最后一个元素

