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
        System.out.println(node.next.data);

        System.out.println("Remove Node : ");
        MyNode node_found = list.FindNode(10);
        list.Remove(node_found);

        System.out.println("Print All Nodes Data After Remove: ");
        list.PrintNodesData();
        System.out.println();

    }
}
