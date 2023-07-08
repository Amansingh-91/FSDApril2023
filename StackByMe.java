public class StackByMe {
    int arr[];
    int top;
    int capacity;

    public StackByMe(int capacity){
        this.capacity = capacity;
        this.top = -1;
        arr = new int[capacity];
    }

    public void push(int data){
        if(top == capacity -1){
            System.out.printf("overflow. can't store %d\n",data);

        }
        else{
            top++;
            arr[top] = data;
        }
    }
    public int pop() throws UserException{
        if(top == -1){
            throw(new UserException("stack is empty"));
        }
        int del = arr[top];
        // garbage value
        arr[top] = -123;
        top--;
        return del;

    }

    public void printStack(){
        if(top != -1){
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("stack is empty");
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public int peek(){
        return arr[top];
    }

    public static void main(String[] args) throws UserException {
        StackByMe s =  new StackByMe(5);
        s.push(12);
        s.push(22);
        s.push(15);
        s.push(17);
        s.push(13);
        // will get stack is full /overflow
        s.push(45);
        s.push(55);

        s.printStack();

        System.out.println(s.pop());
        System.out.println(s.pop());
        for (int i = 0; i < s.arr.length; i++) {
            System.out.print(s.arr[i] +" ");
        }
        System.out.println();
        s.printStack();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        for (int i = 0; i < s.arr.length; i++) {
            
        }


    }


}
