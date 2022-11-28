public class ChildDemo extends ParentDemo{
    String name = "QAauto";

    public ChildDemo(){
        System.out.println("in child constructor");
    }

    public void getString(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData(){
        super.getData();
        System.out.println("in Child class");
    }

    public static void main(String[] args){
        ChildDemo cd = new ChildDemo();
        //cd.getString();
     //   cd.getData();
    }

}
