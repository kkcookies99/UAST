class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
		stack<TreeNode*> st;
        TreeNode* record = nullptr;
        
        while(!st.empty() || root != nullptr)
        {
			while(root!=nullptr){
				st.push(root);
                targetSum -= root->val;
                root=root->left;
			}
            if(!st.empty()){
				root = st.top();
				if(root->right!=nullptr && root->right!= record){
					root=root->right;
				}else{
					st.pop();
                    if(root->left == nullptr && root->right ==nullptr){
                        if(!targetSum) return true;
					}
                    targetSum+=root->val;
                    record=root;
                    root=nullptr;
				}
			}
		}
        return false;
    }
};

