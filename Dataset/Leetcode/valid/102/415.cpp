class Solution {
public:
    map<int,vector<int>>mpp;
    vector<vector<int>> XXX(TreeNode* root) {
        layerOrder(root,0);
        vector<vector<int>>ans;
        for(auto i=mpp.begin();i!=mpp.end();++i)
            ans.push_back(i->second);
        return ans;
    }
    void layerOrder(TreeNode*root,int deep){
        if(root==nullptr)return;
        layerOrder(root->left,deep+1);
        mpp[deep].push_back(root->val);
        layerOrder(root->right,deep+1);
    }
};

