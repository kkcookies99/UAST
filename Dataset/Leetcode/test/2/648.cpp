 class Solution {
public:
    std::pair<ListNode *,int> bitadd(ListNode * l1,ListNode * l2,int low)
    {
        int sum=(l1?l1->val:0)+(l2?l2->val:0)+low;
        int higher=sum/10,lower=sum-higher*10;
        ListNode * retlist=new ListNode(lower);
        return {retlist,higher};
    }
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode * node1=l1->next,* node2=l2->next;
        std::pair<ListNode *,int> pw=bitadd(l1,l2,0);
        ListNode * ret=pw.first,* start=ret;
        int high=pw.second;
        while(node1 || node2 || high)
        {
            std::pair<ListNode *,int> tpw=bitadd(node1,node2,high);
            ret->next=tpw.first;
            high=tpw.second;
            ret=tpw.first;
            node1=node1?node1->next:nullptr;
            node2=node2?node2->next:nullptr;
        }
        return start;
    }
};

