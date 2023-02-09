//B.Prem Goud
//Div : 4b19
//ERP:210303126076

public class ContainsExample {
    public static void main(String[] args) {
        String str = "Hello Javatpoint readers";
        boolean isContains = str.contains("Javatpoint");
        System.out.println(isContains);
        // Case Sensitive
        System.out.println(str.contains("javatpoint")); // false
    }
}