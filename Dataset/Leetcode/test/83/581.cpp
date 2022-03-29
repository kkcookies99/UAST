 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==NULL||head->next==NULL) return head;
        ListNode* H = head;
        ListNode* temp = H->next;
        bool mark = false;
        while(temp!=NULL)
        {
            mark = false;
            if(temp->val!=H->val) 
            {
                mark = true;
                H->next = temp;
                H = H->next;
            }   
            temp = temp->next;
        }
        if(!mark)H->next = NULL;
        return head;
    }
};

