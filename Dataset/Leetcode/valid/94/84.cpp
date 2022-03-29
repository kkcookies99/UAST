 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
    	if(root != nullptr){
    		TreeNode* help;
    		stack<TreeNode*> s;
    		vector<int> result;
    		// 左边保证：向左深入，到空后能返回  右边的 保证：在左侧深入结束，返回到根时，能切换到右侧，在其右子树中亦同样
    		while(!s.empty() || root!= nullptr){
    			if(root != nullptr){
    				s.push(root);
    				root = root->left;
    			}else{
    				help = s.top();
    				s.pop();
    				result.push_back(help->val);
    				root = help->right;
    			}
    		}
    		return result;
    	}
        return {};
    }
};

