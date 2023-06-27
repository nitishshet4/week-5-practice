/* public class S2
{
    public static void main(String[] args) {
       int number=10;
       //Two ways to create String 
       //1.String literal 
       //2.String Object
       
       StringBuffer sb=new StringBuffer("madar"); //thread safe
       StringBuffer sb1=new StringBuffer("madar");
       sb.append(" saheb");
       
       StringBuilder Sb1=new StringBuilder("Alli"); //not thread safe
       Sb1.append(" saheb");
       //If you want to go for mutabulity StringBuffer and StringBuilder
       
       
       
       System.out.println(sb);
       System.out.println(Sb1);
       
      
       
    }
}  */