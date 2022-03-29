 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(!head) return nullptr;
        ListNode* phead = head;
        if(n==1){
            ListNode* cur = nullptr;
            while(phead->next){
                cur = phead;
                phead = phead->next;
            }
            if(!cur) return cur;
            cur->next = nullptr;
            return head;
        }
        ListNode* bhead = head;
        n--;
        ListNode* cur = head;
        while(n--){
            phead = phead->next;
        }
        while(phead->next){
            cur = bhead;
            bhead = bhead->next;
            phead = phead->next;
        }
        if(cur!=bhead)
            cur->next = bhead->next;
        else
            return cur->next;
        return head;
    }
};

