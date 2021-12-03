public class MyStack {
        int size;
        int top;
        int[] StackArray;

        public MyStack (int size) {
                this.size = size;
                StackArray = new int[size];
                top = -1;
        }

        public boolean IsFull() {
               return this.top >= this.size-1;
        }

        public boolean IsEmpty() {
                return this.top == -1;
        }

        // Add Element To Stack Function
        public void push(int el) {
                if(IsFull()) 
                {
                        System.out.println("Stack Is Full");
                        return;
                }
                top++;
                StackArray[top] = el;
                System.out.println(el + " Pushed To The Stack");
        }

        // Remove Element From Stack Function
        public void pop() {
                if(IsEmpty()) 
                {
                        System.out.println("Stack Is Empty");
                        return;
                }
                System.out.println("Delete The Top Element : " + StackArray[top--]);
        }

        // Return Top Element From Stack Function
        public int peeck() {
                if(!IsEmpty()) {
                        return StackArray[top];
                }
                return -1;
        }

        // Print all Stack Elements Function
        public void printStack() {
                if(IsEmpty()) {
                        System.out.println("Stack Is Empty !!");
                        return;
                }
                
                for(int i = top; i >= 0; i--) {
                        System.out.print(StackArray[i] + " ");
                }

                System.out.println("");
        }
 
}
