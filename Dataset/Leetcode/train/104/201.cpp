class Solution {
public:
    vector<int>path;
    vector<vector<int>>res;
    int XXX(TreeNode* root) {
        dfs(root);
        int _sum=0;
        for(int i=0;i<res.size();i++){
            int len=res[i].size();
            if(len>_sum)_sum=len;
        }
        return _sum;
    }
    void dfs(TreeNode* root) {
		if (root != nullptr)
			path.push_back(root->val);
		
        if(root!=nullptr && root->left==nullptr && root->right==nullptr){
            res.push_back(path);
			return;
		}

        
		if (root!=nullptr && root->left) {
			dfs(root->left);
			path.pop_back();
		}
		if (root!=nullptr &&  root->right) {
			dfs(root->right);
			path.pop_back();
		}
	}
};

