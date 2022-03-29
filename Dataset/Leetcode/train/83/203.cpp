class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head) return head;

        ListNode* pre = head;
        ListNode* pIndex = head->next;
        int nTemp = head->val;
        while(pIndex)
        {
            if(pIndex->val == nTemp)
            {
                pre->next = pIndex->next;                
            }
            else
            {
                pre = pre->next;
                nTemp = pre->val;
            }
             pIndex = pIndex->next;       
        }
        
        return head;
    }
};

