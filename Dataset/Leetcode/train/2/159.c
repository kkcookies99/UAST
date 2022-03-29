 struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
        struct ListNode *s1,*s2;
        int i=0;
        s1=l1;
        s2=l2;
        while(s1)
        {
            s1->val=s1->val+s2->val+i;
            i=s1->val/10;
            s1->val%=10;
            s1=s1->next;
            s2=s2->next;
            if(!s1)
            {

                s1=s2;
                s2=NULL;
            }
            while(s1 && !s2)
            {
                if(i)
                {
                    if(!s1)
                        {
                            s1=(struct ListNode*)malloc(sizeof(struct ListNode));
                            s1->next=NULL;  
                            s1->val=0;
                        }
                    s1->val++;
                    i=s1->val/10;
                    s1->val%=10;
                    s1=s1->next;             
               }
               else
                    return l1;

            }
            
        }   
        return l1; 
}

