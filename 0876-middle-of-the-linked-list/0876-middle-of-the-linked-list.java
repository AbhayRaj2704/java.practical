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
    public static int size(ListNode head){
        int cnt=0;
        while(head !=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
    public ListNode middleNode(ListNode head) {
        int length=size(head);
        int mid=length/2;

        for(int i=0; i<mid; i++){
            head=head.next;
        }
        return head;

        
    }
}