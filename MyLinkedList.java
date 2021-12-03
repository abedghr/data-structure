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

    // Remove From Node Function
    public void Remove(MyNode node) {
        MyNode h = head;
        while(h != node) {
            h = h.next;
        }

        h.next = h.next.next;
        size--;

    }

    // Print All Nodes Data Function
    public void PrintNodesData() {
        MyNode h = head;
        while(h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }

}
