class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2)
    {
        if(l1==NULL)
            return l2;
        if(l2==NULL)
            return l1;
        if(l1->val+l2->val <10)
        {
            ListNode* t = new ListNode(l1->val+l2->val);
            t->next = XXX(l1->next, l2->next);
            return t;
        }
        ListNode* t = new ListNode((l1->val + l2->val)%10);
        ListNode* tn = new ListNode((l1->val + l2->val)/10);
        ListNode* addres = XXX(l1->next, l2->next);
        t->next = XXX(tn, addres);
        return t;
    }
};

undefined
document.getElementsByTagName("code");

HTMLCollection(13) [code, code, code.language-php, code, code.language-javascript, code, code, code, code, code, code, code.language-pgsql, code]
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

