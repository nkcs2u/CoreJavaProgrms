public class ChildClassDemo extends ParentClassDemo{
    public void engineChange(){
        System.out.println("Implement engine changes");
    }

    public static void main(String[] args){
        ChildClassDemo cc = new ChildClassDemo();

        cc.audioSystem();
        cc.engineChange();
    }
}
