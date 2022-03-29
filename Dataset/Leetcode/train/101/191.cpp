 class Solution {
public:
	bool XXX(TreeNode* root) {
		if (!root) return true;
		stack<TreeNode*> stk1, stk2;
		stk1.push(root->left); stk2.push(root->right);
		while (!stk1.empty() && !stk2.empty()) {
			TreeNode* p1 = stk1.top(), *p2 = stk2.top();
			stk1.pop(); stk2.pop();
			if (!p1 && !p2) continue;
			else if (p1&&p2) {
				if (p1->val != p2->val) return false;
				else {
					stk1.push(p1->right),stk1.push(p1->left);
					stk2.push(p2->left), stk2.push(p2->right);
				}
			}
			else return false;
		}
		return true;
	}
};

