 class Solution {
public:
	bool XXX(TreeNode* p, TreeNode* q) {
		stack<TreeNode*> myStackP,myStackQ;
		while (p) {
			if (q && p->val != q->val) {
				return false;
			}
			if (!q) {
				return false;
			}

			if (p->left || q->left) {
				myStackP.push(p);
				myStackQ.push(q);
				p = p->left;
				q = q->left;
			}
			else {
				while (!(p->right)&&!myStackP.empty()) {
					p = myStackP.top();
					q = myStackQ.top();
					myStackP.pop();
					myStackQ.pop();
				}
				p = p->right;
				q = q->right;
			}
		}
		if (q)
			return false;
		return true;
	}
};

