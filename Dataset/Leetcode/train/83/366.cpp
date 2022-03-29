 class Solution {
 public:
	 ListNode* XXX(ListNode* head) {
		 if (head == nullptr || head->next == nullptr) {
			 return head;
		 }

		 ListNode* dummy = new ListNode(INT_MAX);
		 dummy->next = head;
		 ListNode* node = dummy;

		 while (node->next != nullptr) {
			 if (node->val == node->next->val) {
				 node->next = node->next->next;
			 }
			 else {
				 node = node->next;
			 }
		 }

		 dummy->next = nullptr;
		 delete dummy;
		 return head;
	 }
 };

