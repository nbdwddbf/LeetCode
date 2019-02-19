/**
 * @Auther: dabuff
 * @Date: 19-2-18 09:48
 * @Description:
 */
public class Num_21 {

    public static void main(String[] args) {
        Solution_21 solution = new Solution_21();
        ListNode l1_1 = new ListNode(1);
        ListNode l1_2 = new ListNode(5);
        l1_1.next = l1_2;
        l1_1.getList(l1_1);
        ListNode l2_1 = new ListNode(2);
        ListNode l2_2 = new ListNode(7);
        l2_1.next = l2_2;
        l2_1.getList(l2_1);

        ListNode result = solution.mergeTwoLists(l1_1, l2_1);
        result.getList(result);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void getList(ListNode node) {
        while (node.next != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println(node.val);
    }
}

class Solution_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        //直接使用链表l1和l2
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        //任一为空时，直接连接另一条链表
        if (l1 == null)
            cur.next = l2;
        else cur.next = l1;

        return head.next;
    }

    public ListNode mergeTwoLists_1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        //新建链表指向l1和l2
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                cur.next = p1;
                cur = cur.next;
                p1 = p1.next;
            } else {
                cur.next = p2;
                cur = cur.next;
                p2 = p2.next;
            }
        }
        //任一为空时，直接连接另一条链表
        if (p1 == null)
            cur.next = p2;
        else cur.next = p1;

        return head.next;
    }
}