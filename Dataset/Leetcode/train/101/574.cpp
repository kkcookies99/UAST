 class Solution {
public:

    vector<int> order;
    void dfs(TreeNode* root,int dep=1){
        if(root == nullptr) return ;
        dfs(root->left,dep+1);
        order.push_back(root->val*dep);
        dfs(root->right,dep+1);
    }
    bool XXX(TreeNode* root) {
        dfs(root);
        int l=0;
        int r = order.size()-1;
        while(r-l>0){
            if(order[l] != order[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
};

