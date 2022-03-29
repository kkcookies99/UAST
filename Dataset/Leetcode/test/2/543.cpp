 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
		ListNode* l3 = new ListNode(0);
		ListNode* head = l3;
		int carry = 0;
		int a = 0;
		while (l1 && l2)
		{
			a = (l1->val + l2->val + carry) % 10;
			carry = ((l1->val + l2->val + carry) >= 10) ? 1 : 0;
			ListNode * p = new ListNode(a);
			l3->next = p;
			l3 = p;
			l1 = l1->next;
			l2 = l2->next;
		}
        ListNode *l;
		if (l1 || l2)
		{
			ListNode* l = (l1) ? l1 : l2;
			while (l && carry == 1)
			{
				a = (l->val + carry) % 10;
				carry = ((l->val + carry) >= 10) ? 1 : 0;
				ListNode * p = new ListNode(a);
				l3->next = p;
				l3 = p;
				l = l->next;
			}
			while (l)
			{
				a = l->val;
				ListNode* p = new ListNode(a);
				l3->next = p;
                l3=p;
				l = l->next;
			}
		}
        if (carry == 1)
		{
			ListNode* p = new ListNode(carry);
			l3->next = p;
		}
		return head->next;
	}
};

