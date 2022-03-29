 class Solution {
public:
	bool XXX(TreeNode* root) {
		TreeNode* cur=root;
		TreeNode* pre=nullptr;
		int curVal;
		int preVal=INT_MIN;
		while(cur){
			if(!cur->left){
				curVal=cur->val;
				if(preVal>=curVal){
					return false;
				}
				preVal=curVal;
				cur=cur->right;
			}
			else{
				pre=cur->left;
				while(pre->right&&pre->right!=cur){
					pre=pre->right;
				}
				if(pre->right==cur){
					pre->right=nullptr;
					curVal=cur->val;
					if(preVal>=curVal){
						return false;
					}
					preVal=curVal;
					cur=cur->right;
				}
				else{
					pre->right=cur;
					cur=cur->left;
				}
			}
		}
		return true;
	}	
};

