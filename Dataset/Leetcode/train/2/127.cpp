class Solution {
public:
	ListNode* XXX(ListNode* l1, ListNode* l2) 
	{
		ListNode *result = new ListNode(0);
		ListNode *currentNode = result;
		int increment = 0;
		while (l1 != NULL||l2 != NULL)
		{
			int sum = increment;
			if (l1!=NULL)
			{
				sum += l1->val;
				l1 = l1->next;
			}
			if (l2!= NULL)
			{
				sum += l2->val;
				l2 = l2->next;
			}
			increment = sum / 10;
			currentNode->next = new ListNode(sum%10);
			currentNode = currentNode->next;
		}

		if (increment>0)
		{
			currentNode->next = new ListNode(increment);
		}
		return result->next;
	}
};

