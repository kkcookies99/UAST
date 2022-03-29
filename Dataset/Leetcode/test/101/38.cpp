 class Solution {
public:
	bool XXX(TreeNode* root) {
		queue<TreeNode*> q;
		q.push(root);
		q.push(root);
		while (!q.empty())
		{
			auto t1 = q.front();
			q.pop();
			auto t2 = q.front();
			q.pop();
			if (!t1 && !t2) continue;
			if (!t1 || !t2)
				return false;
			if (t1->val != t2->val)
				return false;
			q.push(t1->left);
			q.push(t2->right);
			q.push(t1->right);
			q.push(t2->left);
		}
		return true;
	}
};

