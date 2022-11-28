public class ExceptionHandle {
    public static void main(String[] args){
        int a=0;
        int b=1;
        try {
            int c = b / a;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("arry out of bound exception");
        }
        catch (ArithmeticException e){
           // e.printStackTrace();
            System.out.println("Arithmatic exception");
        }catch (Exception e){

        }finally {
            System.out.println("I 'll execute any way...!");
        }
    }
}
