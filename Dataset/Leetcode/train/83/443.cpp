 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if (head == NULL)
			return NULL;
		if (head->next == NULL)
			return head;
		ListNode* node = head->next;
		if (node->val == head->val) {
			head = node;
			return XXX(head);
		}
		head->next = XXX(node);
		return head;
    }
};

