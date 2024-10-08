
public class Nested {

   public static void main(String[]args) {
     for (int number = 1; number <= 5; number++) {
        for(int counter = 1; counter <= number; counter++) {
           System.out.print(number);
      }
      System.out.println();
      }     
   
   //Practice 2
    //public static void practice2 () {
      for(int i = 1; i <= 5; i++) {
         for(int j = i; j < 5; j++) {
            System.out.print(".");
   }
   for (int k = 1; k <= i; k++){
      System.out.print(i);
      }
      System.out.println();
   }


   //Practice 3
      for(int a = 1; a <= 5; a++) {
         for(int b = a; b < 5; b++) {
            System.out.print(".");
   }
   System.out.print(a);
   for(int c = 1; c < a; c++) {
      
      System.out.print(".");
   }
   //System.out.print(".");
   System.out.println();
}   
   }
}
   

   
   



   