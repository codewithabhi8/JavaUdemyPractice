package Exception;

public class Stacks {
    int size;
    int[] arr;
    int top = -1;

    public Stacks(int size) {
        this.size = size;
        arr=new int[size];
    }

    public void push(int i) throws StackOverFlow {
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        arr[top]=i;
    }

    public int pop() throws StackUnderFlow {
        int x=-1;
        if(top == -1) {
            throw new StackUnderFlow();
        }
        x=arr[top];
        top--;
        return x;
    }
}
