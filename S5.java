/* import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
            //   0 1 2
            Scanner sc=new Scanner(System.in);
     String str="geeks";
     char[] ch=str.toCharArray();  //5/2=2.5=3
     
     char[][] newCh=new char[2][3];
      int i=0;
      int j=0;
     
      for(int k=0;k<str.length();k++){ // 0 0 g  1 1  0 1 
      
               //0 0
          newCh[i][j]=ch[k];
          
          if(i==1){
              if(j==1){
                  j=1;
              }
          }
          else{
              j++;
          }
          if(i==0){
              i=1;
          }
          else{
              i=0;
          }
          
      }
      newCh[1][0]='z';
      newCh[1][0]=' ';
     
      
      for(int x=0;x<2;x++){
          for(int y=0;y<3;y++){
              System.out.print(newCh[x][y]+" ");
          }
          System.out.println();
      }
     
    }
}  */