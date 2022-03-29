class Solution {
public:
ListNode *XXX(ListNode *l1, ListNode *l2)
{
    int x1=0,x2=0;
    ListNode* L=l1;
    while(L!=NULL)
    {
        x1++;
        L=L->next;
        
    }
    L=l2;
    while(L!=NULL)
    {   
        x2++;
        L=L->next;
       
    }   
    ListNode* q1;
    ListNode* q2;
    ListNode* l3=new ListNode;
    l3->next=NULL;
    ListNode* q3=l3;
    if(x1<x2)
    {
        q1=l1;
        q2=l2;
    }
    else
    {
        q1=l2;
        q2=l1;
    }//q1指向短的那个
    bool flag=false;
    int t;
    int l=min(x1,x2),h=max(x1,x2);
//9 9 9 9 
//9 9 9 9 9 9 9
    for(int i=1;i<=l;i++)
    {
        t=q1->val+q2->val;
        if(t>=10&&flag==true)
        {
            q3->val=(t+1)%10;
        }
        else if(t>=10&&flag==false)
        {
            q3->val=t%10;
            flag=true;
        }
        else if(t<10&&flag==true)
        {
            if(t==9)
            {
                q3->val=0;
            }
            else
            {
                q3->val=t+1;
                flag=false;
            }
        }
        else if(t<10&&flag==false)
        {
            q3->val=t;
        }
        q1=q1->next;
        q2=q2->next;
        if(q1!=NULL&&q2!=NULL)
        {
            q3->next=new ListNode;
            q3=q3->next;
            q3->next=NULL;
        }
        
    }
//9 9 9 9
//9 9 9 9 9 9 9
    if(q1==NULL&&q2!=NULL)
    {
        q3->next=new ListNode;
        q3=q3->next;
        q3->next=NULL;
    }
    
    for(int i=l;i<h&&q3!=NULL&&q2!=NULL;i++)
    {
        
        if(flag==true&&q2->val!=9)
        {
            q3->val=q2->val+1;
            flag=false;
            q2=q2->next;
            if(q2!=NULL)
            {
                q3->next=new ListNode;
                q3=q3->next;
                q3->next=NULL;
            }
            
        }
        else if(flag==true&&q2->val==9)
        {
            q3->val=0;
            q2=q2->next;
             if(q2!=NULL)
            {
                q3->next=new ListNode;
                q3=q3->next;
                q3->next=NULL;
            }
        }
        else
        {
            q3->val=q2->val;
            q2=q2->next;
             if(q2!=NULL)
            {
                q3->next=new ListNode;
                q3=q3->next;
                q3->next=NULL;
            }
        }
    }
       if(flag==true)
    {
        q3->next=new ListNode;
        q3=q3->next;
        q3->next=NULL;
        q3->val=1;
    }


return l3;

}

};

