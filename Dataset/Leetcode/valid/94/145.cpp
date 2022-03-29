 class Solution {
public:
        vector<int> ret;
    vector<int> XXX(TreeNode* root) {
		if(root != NULL ){
			XXX(root->left);
			ret.push_back(root->val);
			XXX(root->right);
		}
		return ret;
        
    }
};

