class StackOverflowException extends Exception {
    public String toString() {
        return "Stack is full";
    }

}

class StackUnderflowException extends Exception {
    public String toString() {
        return "Stack is Empty";
    }

}

class Stack {
    private int e[];
    private int size;
    private int top = -1;

    public Stack(int sz) {
        size = sz;
        e = new int[size];
    }

    public void push(int x) throws Exception {

        if (top == size - 1)
            throw new StackOverflowException();

        top++;
        e[top] = x;
    }

    public int pop() throws Exception {

        int x = -1;
        if (top == -1)
            throw new StackUnderflowException();

        x = e[top];
        top--;
        return x;

    }

}

public class StackChallenge {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack(5);
        try {

            st.pop();
            // st.push(100);
            // st.push(400);
            // st.push(300);

            // st.push(100);
            // st.push(400);
            // st.push(300);

        } catch (StackOverflowException e) {
            System.out.println(e);
        }

    }

}
