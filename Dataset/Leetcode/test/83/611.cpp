 class Solution {
public:
    ListNode* XXX(ListNode* head) {
	if(head == nullptr) return nullptr;
    	int rec = head->val;
    	ListNode * tmp = new ListNode(rec);
	ListNode * ans = tmp;
    	head = head->next;
        while(head){
		if(rec != head->val){
			tmp->next = new ListNode(head->val);
			rec = head->val;
			tmp = tmp->next;
		}
		head = head->next;
        }
        return ans;
    }
};

