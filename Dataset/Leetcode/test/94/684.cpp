 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
       stack<TreeNode*> treeStack;
		vector<int> *resVector = new vector<int>();
		while (true) {
			goAloneLeft(root,&treeStack);
			if (treeStack.empty()) break;
			root = treeStack.top();
			resVector->push_back(root->val);
			treeStack.pop();
			root = root->right;
		}
		return *resVector;
    }
    void goAloneLeft(TreeNode* node,stack<TreeNode*> *treeStack) {
		while (node)
		{
			treeStack->push(node);
			node = node->left;
		}
	}
};

