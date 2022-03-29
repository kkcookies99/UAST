/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
    ListNode *head = new ListNode();
    auto bef=head;
    int x=0;
    while(l1 || l2 )
    { 
        int x1= l1? l1->val:0;
        int x2= l2? l2->val:0;
        int s=(x1+x2+x);
        x=s/10;
        bef->next=l1?l1:l2;
        bef=bef->next;
        bef->val=s%10;
        if(l1) l1=l1->next;
        if(l2) l2=l2->next;
    }
    if (x!=0)
    {
 ListNode *temp=new ListNode(x);
             
                bef->next=temp;
    }
    return head->next;
    }
};

