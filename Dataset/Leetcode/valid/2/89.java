/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /*1 确定链表元素的个数*/
    private  int member(ListNode listNode){
        int i = 0;
        while(listNode!=null){
            i = i+1;
            listNode = listNode.next;
        }
        return i;
    }
    /*2 取两个数中的最大数*/
    private  int maxmember(int number1,int number2){
        if(number1>=number2){
            return number1+1;
        }
        else
            return number2+1;
    }
    /*3 将链表转换为数组*/
    private int[] link_to(ListNode listNode,int j){
        /*测试数据*/
        int array[] = new int[j],i;
        i = 0;
        while(listNode!=null) {
            array[i]= listNode.val;
            i = i+1;
            listNode=listNode.next;
        }
        return array;
    }
    /*4 数组相加*/
    private int[] toadd(int array1[],int array2[]){
        for(int i=0;i<array1.length;i++){
            int t = 0;
            array1[i] = array1[i] + array2[i];
            if(array1[i]>9){
                array1[i] = array1[i] - 10;
                array1[i+1] = array1[i+1] + 1;
            }
        }
        return array1;
    }
    /*5 将数组变成链表*/
    private  ListNode endchange(int number[]){
        ListNode listNodeStart = new ListNode();
        ListNode listNode;
        listNode = listNodeStart;

        for(int i=0;i<number.length;i++){
            listNode.val =number[i];
            System.out.println(number[i]);
            /*避免最后一位零输出*/
            if(i==number.length-2&&number[i+1]==0){
                break;
            }
            /*避免出现空的节点*/
            if(i==number.length-1)
                break;
            ListNode newnode = new ListNode();
            listNode.next=newnode;
            listNode = newnode;
        }
        listNode=listNodeStart;
        return listNode;
    }
    public ListNode XXX(ListNode l1, ListNode l2) {
               int number1 = member(l1);
        int number2 = member(l2);
        int max = maxmember(number1,number2);
        int array1[] = link_to(l1,max);
        int array2[] = link_to(l2,max);
        int sumarray[] = toadd(array1,array2);
        return  endchange(sumarray);
    }
}

