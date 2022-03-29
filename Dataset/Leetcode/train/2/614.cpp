 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int up = 0;
        ListNode* tmp = NULL;
        ListNode* head = NULL;
        while(l1 != NULL || l2 != NULL || up != 0)
        {
            int ans = ((l1 == NULL?0:l1->val)+(l2 == NULL?0:l2->val) + up) ;
            
            ListNode* newNode = new ListNode(ans%10);
            if(!head){
                head = newNode;
            }
            else{
                tmp->next = newNode;
            }
            tmp = newNode;
            up = ans / 10;
            if(l1 != NULL)
            l1 = l1->next;
            else
            l1 = NULL;
            if(l2 != NULL)
            l2 = l2->next;
            else
            l2 = NULL;
        }
        return head;
    }
};

