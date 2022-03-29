class Solution {
public:
	queue<TreeNode*> ique;
	map<TreeNode*, int> tmap;
	vector<vector<int>> XXX(TreeNode* root) {
		vector<int> display;
		vector<vector<int>> res;
		if (root == NULL) {

			display.resize(0);
			return res;
		}
		vector<TreeNode*>Tvec;
		int layer = 0;

		ique.push(root);

		tmap.insert(make_pair(root, 0));
		while (!ique.empty())
		{
			TreeNode* front = ique.front();
			Tvec.push_back(front);
			ique.pop();

			if (front->left&&front->right) {
				layer++;
				tmap.insert(make_pair(front->left, tmap[front] + 1));
				tmap.insert(make_pair(front->right, tmap[front] + 1));

				ique.push(front->left);
				ique.push(front->right);
			}
			if (front->left && !front->right) {
				layer++;
				tmap.insert(make_pair(front->left, tmap[front] + 1));
				//front->left->layer = layer;
				//ivectemp.push_back(layer);
				ique.push(front->left);

			}
			if (front->right && !front->left) {
				layer++;
				ique.push(front->right);
				tmap.insert(make_pair(front->right, tmap[front] + 1));
			}
		}
		int i = 0;
		int currentlayer = 0;
		vector<int> ivec;
		while (i < Tvec.size())
		{
			if (currentlayer == tmap[Tvec[i]]) {
				ivec.push_back(Tvec[i]->val);
			}
			else
			{
				currentlayer = tmap[Tvec[i]];
				res.push_back(ivec);
				ivec.clear();
				ivec.push_back(Tvec[i]->val);
			}
			i++;
		}
		res.push_back(ivec);
		return res;


	}
};

