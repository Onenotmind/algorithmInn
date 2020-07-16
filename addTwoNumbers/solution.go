/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
  if l1 == nil {
    return l2
  }
  if (l2 == nil) {
    return l1
  }
  root := &ListNode{Next: nil }
  head := root
  inc := 0
  for {
    if (l1 == nil && l2 == nil) {
      if inc > 0 {
        root.Next = &ListNode{ Val: inc, Next: nil}
      }
      break
    }
    l1Val := 0
    if l1 != nil {
      l1Val = l1.Val
    }
    l2Val := 0
    if l2 != nil {
      l2Val = l2.Val
    }
    val := l1Val + l2Val + inc
    if val >= 10 {
      val = val - 10
      inc = 1
    } else {
      inc = 0
    }
    root.Next = &ListNode{ Val: val, Next: nil}
    root = root.Next
    if l1 != nil {
      l1 = l1.Next
    }
    if l2 != nil {
      l2 = l2.Next
    }
  }
  return head.Next
}