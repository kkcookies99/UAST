class Solution {
    public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode res=l1;
        int isAdd=0;
        while(l1!=null&&l2!=null){
            l1.val+=l2.val;
            if(isAdd==1){
                l1.val++;
                isAdd=0;
            } 
            if(l1.val>=10){
                isAdd=1;
                l1.val-=10;
            }
            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null){
            l1=l2;
        }

        while(l1!=null){
                if(isAdd==1){
                    l1.val++;
                    isAdd=0;
                }
                if(l1.val>=10){
                isAdd=1;
                l1.val-=10;
                }
                l1=l1.next;
            }
            if(isAdd==1){
                ListNode last=new ListNode(1,null);
                l1=last;
            }
        return res;

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

