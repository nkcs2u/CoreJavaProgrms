public class ThisKeyword {
    int a = 2;

    public void fun1(){
        int a = 3;
        System.out.println(this.a);
    }

    public static void main(String[] args){
        new ThisKeyword().fun1();
    }
}
