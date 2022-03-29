 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
    vector<int>  result;
    TreeNode* p;
	p = root;
    stack<TreeNode*> s;
	while (p || !s.empty())
	{
		if (p) 
		{ 
			s.push(p); 
			p = p->left; 
		}
		else
		{
			TreeNode* ret = s.top();
            s.pop();
            result.push_back(ret->val);
            p = ret->right;
		}
	}
	return result;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


