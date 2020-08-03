public class HelloWorld {
    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String name) {
        String N = name.substring(0, 1).toUpperCase();
        String Name = N + name.substring(1);
        return "Hello " + Name;
    }
}
