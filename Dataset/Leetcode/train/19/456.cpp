 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {

        ListNode* newRoot = new ListNode(0);
        newRoot->next = head;

        ListNode* p = newRoot;
        ListNode* q = newRoot;

        int temp = n;

        while(n-- && q!=NULL){
            q = q->next;
        }
        if(q == NULL)
            return newRoot->next;

        ListNode* pre = p;

        while(q!=NULL){
            q = q->next;
            pre = p;
            p = p->next;
        }
        pre->next = p->next;
        delete p;

        return newRoot->next;

    }
};

