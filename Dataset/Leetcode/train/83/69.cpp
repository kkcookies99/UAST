class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head) return head;
        int prevVal = head->val;
        ListNode* curr = head->next;
        ListNode* prev = head;
        
        while(curr){
            if(curr->val == prevVal){
                prev->next = curr->next;
                curr = curr->next;
            }
            else{
                prevVal = curr->val;
                prev = curr;
                curr = curr->next;
            }
        }
        
        return head;
    }
};

