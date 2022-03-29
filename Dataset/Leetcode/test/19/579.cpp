 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* fast = head;
        ListNode* slow = head;
        for (int i=0; i<n; i++){
            fast = fast->next;
        }
        if (fast == nullptr) return head->next;
        while(fast->next != nullptr){
            fast = fast->next;
            slow = slow->next;
        }
        slow->next = slow->next->next;
        return head;
    }
};

