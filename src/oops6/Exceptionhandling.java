package oops6;

public class Exceptionhandling {
    public static void main(String[] args) {
        int a=5;
        int b=0;
         try {
             String name = "praveen";
             if (name.equals("praveen")) {
                 throw new myexception("name is praveen");
             }
         }catch (myexception e){
             System.out.println(e.getMessage());
         } catch (ArithmeticException e) {
             System.out.println(e.getMessage());
         }catch (Exception e){
             System.out.println("just  an normal exception");

         }finally {
             System.out.println("this keyword will be always execute");
         }
    }
    static int divide(int a,int b)throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("please do not divideby zero");
        }
        return a/b;
    }
}
