public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Hello LinkedList");
        System.out.println("");

        MyLinkedList list = new MyLinkedList();
        list.AddLast(5);
        list.AddLast(10);
        list.AddLast(15);
        list.AddLast(20);
        
        System.out.println("Print All Nodes Data After Add Last : ");
        list.PrintNodesData();
        System.out.println();
        
        list.AddFirst(0);
        System.out.println("Print All Nodes Data After Add First : ");
        list.PrintNodesData();
        System.out.println();
        
        System.out.println("Find Node Position Depend on element : ");
        System.out.println(list.FindPosition(10));

        System.out.println("Find Node Depend on element and Print Node data : ");
        MyNode node = list.FindNode(15);
        if(node != null)
            System.out.println(node.data);
        else
            System.out.println(node);

        System.out.println("Remove Node : ");
        MyNode node_found = list.FindNode(10);
        if(node_found != null)
            list.Remove(node_found);

        System.out.println("Print All Nodes Data After Remove: ");
        list.PrintNodesData();
        System.out.println();

        while(list.size != 0) {
            list.RemoveFirst();
        }
        list.AddLast(10);
        list.AddLast(20);
        list.AddLast(30);
        list.AddLast(10);
        list.AddLast(20);
        list.PrintNodesData();
        // Remove Duplicate
        System.out.println("Remove Duplicate");
        System.out.println("Before Remove:");
        list.PrintNodesData();
        System.out.println("After Remove");
        MyLinkedList uniqueList = list.removeDuplicate();
        uniqueList.PrintNodesData();
        System.out.println("");

        // Union Two Linked List
        while(list.size != 0) {
            list.RemoveFirst();
        }
        System.out.println("Union Two Linked List");
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        
        list1.AddLast(10);
        list1.AddLast(20);
        list1.AddLast(10);
        list2.AddLast(30);
        list2.AddLast(10);
        list2.AddLast(50);
        list2.AddLast(30);

        System.out.println("First List");
        list1.PrintNodesData();
        System.out.println("");
        System.out.println("Second List");
        list2.PrintNodesData();
        System.out.println("");
        System.out.println("Union List");
        
        MyLinkedList unionList = new MyLinkedList();
        unionList = unionList.unionLinkedList(list1, list2);
        unionList.PrintNodesData();
        System.out.println("");

        MyLinkedList nth_list = new MyLinkedList();
        nth_list.AddLast(10);
        nth_list.AddLast(20);
        nth_list.AddLast(30);
        nth_list.AddLast(40);
        nth_list.AddLast(50);
        nth_list.AddLast(60);
        nth_list.AddLast(70);
        MyNode nth_node = nth_list.getNthNodeDate(5);
        System.out.println(nth_node.data);
    }
}
