class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
		vector<vector<int>>res;
		vector<int>temp;
		queue<TreeNode*>q;
		int target = 1;
		int d = 0;
		if (!root)
			return res;
		q.push(root);
		while (!q.empty())
		{
			TreeNode *pt = q.front();
			temp.push_back(pt->val);
			q.pop();

			if (pt->left)
				q.push(pt->left);
			if (pt->right)
				q.push(pt->right);

			if (target == ++d) {
				target = q.size();
				d = 0;
				res.push_back(temp);
				temp.clear();
			}
		}
		return res;
	}
};

