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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        //converting to array
        ListNode temp1 = list1;
        while (temp1!=null) {
            arr.add(temp1.val);
            temp1 = temp1.next;

        }
        ListNode temp2 = list2;
        while (temp2!=null) {
            arr.add(temp2.val);
            temp2 = temp2.next;
            
        }
        //sorting
        Collections.sort(arr);
        if (arr.size() == 0)
            return null;


        ListNode head = new ListNode(arr.get(0));
        ListNode temp = head;

        for (int i=1; i<arr.size(); i++) {
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }
        return head;
    }
}