 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* head=new ListNode;
        int num1=0,num2=0,num=0;
        int temp=0;
        // if(l1==NULL && l2==NULL)
        //     return;
        while(l1!=NULL)
        {
            num1 = num1*10+l1->val;
            l1 = l1->next;
        }
        while(l2!=NULL)
        {
            num2 = num2*10+l2->val;
            l2 = l2->next;
        }
        num1 = reverse_num(num1);
        num2 = reverse_num(num2);
        num = num1+num2;
        ListNode* p = head;
        if(num==0)
        {
            ListNode* pNewNode = new ListNode;
            pNewNode->val=0;
            pNewNode->next=NULL;
            p->next = pNewNode;
        }
        p = head;

        while(num>0 && p!=NULL)
        {
            temp = num%10;
            ListNode* pNewNode = new ListNode;
            pNewNode->val = temp;
            pNewNode->next = NULL;
            p->next = pNewNode;
            p = pNewNode;
            num = num/10;
        }
        return head->next;
    }

    float reverse_num(int n)
    {
        float res = 0, digit = 0;
        while (n > 0)
        {
            digit = n % 10;
            res = res * 10 + digit;
            n /= 10;
        }
        return res;
    }
};
这样的话会溢出，[9][1,9,9,9,9,9,9,9,9,9]不能通过，怎么修改可以通过？

