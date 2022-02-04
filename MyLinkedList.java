import org.w3c.dom.Node;

public class MyLinkedList {
        
    MyNode head = null;
    MyNode tail = null;

    int size = 0;

    // Add Last Function
    public void AddLast (int el) {
        MyNode tmp = new MyNode();
        tmp.data = el;
        if(size == 0 ) {            
            head = tmp;
            tail = tmp;
            size++;
            return;
        }

        tail.next = tmp;
        tail=tmp;
        size++;

    }


    // Add First Function
    public void AddFirst(int el) {
        MyNode tmp = new MyNode();
        tmp.data = el;

        if(size == 0) {
            head = tmp;
            tail = tmp;
            size++;
            return;
        }

        tmp.next = head;
        head = tmp;
        size++;
    }

    // Find Node Position Depend On Data
    public int FindPosition(int el) {
        MyNode h = head;
        int pos = 0;
        while(h != null) {
            if(h.data == el) {
                return pos;
            }
            pos++;
            h = h.next;
        }
        return -1;
    }

    // Find Node Depend On Data Function
    public MyNode FindNode(int el) {
        MyNode h = head;
        while(h != null) {
            if(h.data == el) {
                return h;
            }
            h = h.next;
        }
        return null;
    }


    // Add Node After another Node Function
    public void AddAfter(int el, int old_el) {
        MyNode node = FindNode(old_el);
        if(node != null) {
            MyNode tmp = new MyNode();
            tmp.data = el;
            tmp.next = node.next;
            node.next = tmp;
            size++;
        }
    }

    public void RemoveFirst() {
        head = head.next;
        size--;

    }

    // Remove From Node Function
    public void Remove(MyNode node) {
        MyNode h = head;
        MyNode prev_node = h;

        while(h != node) {
            prev_node = h;
            h = h.next;
        }

        if(h == node) {
            if(size == 1) {
                prev_node = null;
                head = null;
                
            } else {
                prev_node.next = prev_node.next.next;
            }
            size--;
        }

    }

    // Print All Nodes Data Function
    public void PrintNodesData() {
        MyNode h = head;
        while(h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }

    public MyLinkedList removeDuplicate() {
        MyNode he = head;
        MyLinkedList uniqueList = new MyLinkedList();
        uniqueList.AddFirst(he.data);
        MyNode h = uniqueList.head;
        MyNode x = h;

        while(he != null) {

            boolean add = true;

            while(h != null) {
                
                if(he.data == h.data) {
                    add = false;
                    break;
                }
                
                if(h.next == null) break;
                h = h.next;
            }

            if(add) uniqueList.AddLast(he.data);

            he = he.next;
            h = x;
        }

        return uniqueList;
    }

    public MyLinkedList unionLinkedList(MyLinkedList list1, MyLinkedList list2) {
        
        MyLinkedList unionList = new MyLinkedList();
        
        MyNode list1_head = list1.head;
        while(list1_head != null) {
            unionList.AddLast(list1_head.data);
            list1_head = list1_head.next;
        }

        MyNode list2_head = list2.head;
        while(list2_head != null) {
            unionList.AddLast(list2_head.data);
            list2_head = list2_head.next;
        }
        
        unionList = unionList.removeDuplicate();

        return unionList;
    }

    public MyNode getNthNodeDate (int target) {

        int n = this.size - target + 1;

        if(size == 0 || n > size) return null;

        int count = 1;
        MyNode h = this.head;
        while(h != null) {
            
            if(count != n) {
                count++;
                h = h.next;
                continue;
            }
            
            return h;
        }
        
        return null;
    }
}
