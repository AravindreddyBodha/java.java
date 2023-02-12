//B.Aravind reddy
//Div : 4b19
//ERP:210303126088


public class StringGetBytes{
    public static void main(String args[]){
        String s1="ABCDEFG";
        byte[] barr=s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
    }
}
