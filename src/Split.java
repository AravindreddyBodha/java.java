//B.Aravind Reddy
//Div : 4b19
//ERP:210303126088

public class SplitExample{
    public static void main(String args[]){
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");
//using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }
    }
}
