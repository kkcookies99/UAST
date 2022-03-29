 class Solution {
public:
public:
	ListNode* XXX(ListNode* l1, ListNode* l2) {
		int carry = 0;
		int s = l1->val + l2->val;
		if (s > 9) {
			carry = 1;
			s = s - 10;
		}
		ListNode* temp=new ListNode;
		ListNode* head=new ListNode(s);
		temp = head;
		l1 = l1->next;
		l2 = l2->next;
		while (1) {
			if (l1 == nullptr && l2 == nullptr) {
				if (carry != 0) {
					ListNode* ln = new ListNode;
					ln->val = carry;
					temp->next = ln;
				}
				break;
			}
            int a,b;
            int l1Val = l1 != nullptr ? l1->val : 0;
            int l2Val = l2 != nullptr ? l2->val : 0;
			int sumval = l1Val + l2Val+carry;
			carry = sumval / 10;
			ListNode* l = new ListNode(sumval % 10);
			temp->next = l;
			temp = l;
			if (l1 != nullptr) {
				l1 = l1->next;
			}
			if (l2 != nullptr) {
				l2 = l2->next;
			}
		}
		return head;
	}
};

