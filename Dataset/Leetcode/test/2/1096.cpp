 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) 
    {
        static int c = 0;
        int l1Val = l1 != nullptr ? l1->val : 0;
        int l2Val = l2 != nullptr ? l2->val : 0;
        if(l1==nullptr && l2==nullptr)
        {
            if(c==0)
            {
                return nullptr;
            }
            else
            {
                return  new ListNode(1);
            }
        }
        if(l1 == nullptr && l2 != nullptr)
        {
            l1 = new ListNode(0);
        }
        if(l2 == nullptr && l1 != nullptr)
        {
            l2 = new ListNode(0);            
        }

        int rval = l1Val + l2Val + c;
        int rval_ = rval % 10;
        c = rval/10;

        return new ListNode(rval_,XXX(l1->next,l2->next));
    }
};

