 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head) return nullptr;
        ListNode* cur = head;
        ListNode* ptr = head;
        while(cur){
            bool cnt = false;
            while( ptr->next && ptr->val == ptr->next->val){ptr=ptr->next; cnt=true;}//一直到不等的处
            if(cnt)  ptr = cur->next = ptr->next;
            
            ptr = cur= cur->next;
        }
        return head;
    }
};

