struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
            struct ListNode *s1,*s2,*p;
            s1= NULL;
            s2=NULL;
            int i=0;
            s1=l1;
            s2=l2;
            while(s1 && s2)         //计算l1和l2一一对应的部分
            {
                s1->val=s1->val+s2->val+i;
                i=s1->val/10;
                s1->val%=10;
                p=s1;
                s1=s1->next;
                s2=s2->next;
            }
            if(!s1 && s2)       //把l2多余部分接到l1之后，这样只用计算一条链表就可以了
               {
                s1=s2;
                p->next=s1;
               }              
            while(s1)           //l1有元素，从左到右加进位
             {
                if(i)
                s1->val++;
                i=s1->val/10;
                s1->val%=10;
                p=s1;
                s1=s1->next;
            }
            if(i)       //当l1没有元素但进位是1，开辟新的空间，插入到链表最后
            {
                s1=(struct ListNode*)malloc(sizeof(struct ListNode));
                s1->next=NULL;
                s1->val=1;
                p->next=s1;
            }
            return l1;
            
}

