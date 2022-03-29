 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head) return head;
        ListNode *font = head;
        ListNode *end = head->next;
        while(font->next){
            if(font->val == end->val){
                font->next = end->next;
                delete end;
            }else font = end;
            end = font->next;
        }
        return head;
    }
};

