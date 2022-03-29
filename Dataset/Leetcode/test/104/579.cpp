class Solution {
public:
   int XXX(TreeNode* root) 
	{
		list<TreeNode*>vec1, vec2;
		int sum{};
		if (root)
		{
			vec2.emplace_back(root);
			while (!(vec1.empty() && vec2.empty()))
			{
				++sum;
				vec1.swap(vec2);
				vec2.clear();
				for (auto const i : vec1)
				{
					if (i->left)
						vec2.emplace_back(i->left);
					if (i->right)
						vec2.emplace_back(i->right);
				}
				vec1.clear();
			}
		}
		return sum;
	}
};

