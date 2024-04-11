public class Parent {
    private String name;
    private int age;

    public Parent(){

    }
    public Parent(String names, int myage){
        name=names;
        myage=age;

    }

    public void walking(){
        System.out.println(" Parent is walking");
    }

    public void walking(String name){
        System.out.println(name+ " Parent is walking");
    }
}
