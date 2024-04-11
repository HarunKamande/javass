public class Child extends Parent {
    @Override
    public void walking(String name) {
        super.walking("Kamande");

    }

    public static void main(String[] args){
        Child pa1 =new Child();
        pa1.walking();

    }
}
