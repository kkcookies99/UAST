ListNode* XXX(ListNode* l1, ListNode* l2) 
    {
        //将L1作为待返回的链表
        ListNode* curr1=l1;
        ListNode* curr2=l2;
        ListNode* currx;
        int flag=0;
        int currval;
        while (true)
        {
            currval=curr1->val+curr2->val+flag;
            if (currval>9){currval-=10;flag=1;}
            else{flag=0;}
            curr1->val=currval;
            if (curr1->next==nullptr){currx=curr2->next;break;}
            if (curr2->next==nullptr){currx=curr1->next;break;}
            curr1=curr1->next;
            curr2=curr2->next;
        }
        curr1->next=currx;
        while (flag!=0)
        {
            if (curr1->next==NULL)
            {
                currx=new ListNode(1);
                curr1->next=currx;
                curr1=curr1->next;
                flag=0;
            }
            else 
            {
                curr1=curr1->next;
                curr1->val+=1;
                if (curr1->val>9){curr1->val=0;flag=1;}
                else {flag=0;}
            }
        }
        return l1;
    }

undefined
document.getElementsByTagName("code");

HTMLCollection(11) [code, code, code, code, code, code.language-java, code.language-java, code, code, code, code]
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

