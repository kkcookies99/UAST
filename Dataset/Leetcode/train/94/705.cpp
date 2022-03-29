 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*>    sta;
        TreeNode* p;
        for(p = root ; p ; p = p -> left)
            sta.push(p);
        while(!sta.empty()){
            p = sta.top();
            ans.push_back(p -> val);
            sta.pop();
            for(p = p -> right ; p ; p = p -> left)
                sta.push(p);
        }
        return  ans;
    }
};

