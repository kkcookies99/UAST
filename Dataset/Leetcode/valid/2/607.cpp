 class Solution {
public:
	ListNode* XXX(ListNode* l1, ListNode* l2) {
		if (l1 == NULL)//21 + 3213
			return l2;
		if (l2 == NULL)
			return l1;
		ListNode* result = new ListNode((l1->val + l2->val)%10);
		int carry_flag = (l1->val + l2->val)/10;
		l1 = l1->next;
		l2 = l2->next;

		ListNode* before = result;
		ListNode* next = NULL;
		while (l1 != NULL && l2 != NULL) {
			next = new ListNode((l1->val + l2->val+carry_flag) % 10);
			carry_flag = (l1->val + l2->val + carry_flag) / 10;

			before->next = next;
			before = next;

			l1 = l1->next;
			l2 = l2->next;
		}
		while (l1 != NULL)
		{
			next = new ListNode((l1->val+ carry_flag) % 10);
			carry_flag = (l1->val + carry_flag) / 10;

			before->next = next;
			before = next;

			l1 = l1->next;
		}
		while (l2 != NULL)
		{
			next = new ListNode((l2->val + carry_flag) % 10);
			carry_flag = (l2->val + carry_flag) / 10;

			before->next = next;
			before = next;

			l2 = l2->next;
		}
        if(carry_flag)
			before->next = new ListNode(carry_flag);
		return result;
	}
};

