public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[]{"A3686L", "C3562H"};
    public static final String[] invalidClass = new String[]{"d3686L", "e3562H"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String name : validClass) {
            boolean isvalid = classExample.validate(name);
            System.out.println("Class is " + name + "is valid: " + isvalid);
        }
        for (String name : invalidClass) {
            boolean isvalid = classExample.validate(name);
            System.out.println("Class is " + name + "is valid: " + isvalid);
        }
    }
}