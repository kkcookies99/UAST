 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head == nullptr) return NULL;
        if(head->next == NULL) return head;
        ListNode *slow = head;
        ListNode *quick = slow->next;
        while(quick != nullptr){
            if(slow->val == quick->val){
            slow->next = quick->next;
            quick = quick->next;
            
        }
            else{
                slow = slow->next;
                quick = quick->next;
            }        
        }
        return head;
    }
};

