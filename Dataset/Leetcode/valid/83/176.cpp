class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==nullptr || head->next==nullptr){
            return head;
        }
        ListNode *a = head;
        ListNode *b = head->next;
        while(b!=nullptr){  
            if(b->val == a->val){
                b = b->next;
            }else{
                a->next = b;
                a = b;
                b = b->next;
            }     
        }
        a->next = b;
        return head;
    }
};

