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
    public ListNode sortList(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        List<Integer>l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        Collections.sort(l);
        for(int i:l){
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        return dummy.next;
    }
}