 class Solution {
public:
	vector<vector<int>> XXX(TreeNode* root) {
		if (root == NULL)
		{
			return (vector<vector<int>>)NULL;
		}

		this->q1->push(root);
		this->is_q1 = true;

		while (!this->q1->empty() || !this->q2->empty())
		{
			this->is_q1 ? this->doWork(this->q1, this->q2) : this->doWork(this->q2, this->q1);
		}

		return *(this->result);
	}
private:
	queue<TreeNode*> *q1 = new queue<TreeNode*>;
	queue<TreeNode*> *q2 = new queue<TreeNode*>;
	vector<int> *row = new vector<int>;
	vector<vector<int>> *result = new vector<vector<int>>;
	bool is_q1;

	void doWork(queue<TreeNode*> *pop, queue<TreeNode*> *push)
	{
		TreeNode *node = NULL;

		if (!pop->empty())
		{
			node = pop->front();
			if (node->left != NULL)
			{
				push->push(node->left);
			}
			if (node->right != NULL)
			{
				push->push(node->right);
			}
			this->row->push_back(node->val);
			pop->pop();
		}
		if (pop->empty())
		{
			this->result->push_back(*(this->row));
			this->row = new vector<int>;
			this->is_q1 = !this->is_q1;
		}
	}
};


