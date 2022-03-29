class Solution {
public:
	int XXX(TreeNode* root) {
		if (root == NULL) {
			return 0;
		}
        //左子树深度、右子树深度最大值 + 1（根节点）
		return max(XXX(root->left), XXX(root->right)) + 1;
	}
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


