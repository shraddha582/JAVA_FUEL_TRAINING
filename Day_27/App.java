package demo;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.setId(100);
        st.setName("test");

        StudImpl ob;
        ob = new StudImpl();
        ob.update(st);

    }
}
