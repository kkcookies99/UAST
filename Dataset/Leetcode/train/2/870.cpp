 class Solution {
public:
	ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode *re = new ListNode(0), *r = re;
		for (int j1 = 1, j2 = 1, i = 0, sum = 0;;) {
			sum = l1->val*j1 + l2->val*j2 + i;
			i = sum / 10;
			re->next = new ListNode(0);
			re = re->next;
			re->val = sum % 10;
			if (l1->next == NULL && l2->next == NULL && i == 0)break;
			if (l1->next != NULL)l1 = l1->next;
			else j1 = 0;
			if (l2->next != NULL)l2 = l2->next;
			else j2 = 0;
		}
		re->next = NULL;
		return r->next;
	}
};

