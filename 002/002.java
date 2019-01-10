/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode cursor = ans;
        
        while (l1 != null || l2 != null) {
            int carry = 0;
            if(l1 != null && l2 != null) {
                carry = (cursor.val + l1.val + l2.val)/10;
                cursor.val = (cursor.val + l1.val + l2.val)%10;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 == null && l2 != null){
                carry = (cursor.val + l2.val)/10;
                cursor.val = (cursor.val + l2.val)%10;
                l2 = l2.next;
            }else if(l1 != null && l2 == null){
                carry = (cursor.val + l1.val)/10;
                cursor.val = (cursor.val + l1.val)%10;
                l1 = l1.next;
            }
            
            if(l1 == null && l2 == null){
                if(carry != 0){
                    cursor.next = new ListNode(carry);
                }
                break;
            }
            
            cursor.next = new ListNode(carry);
            cursor = cursor.next;
        }
        return ans;
    }
}
