public class Car{
    private String name;
    private  String manufucturer;
    private String lincence_provider;



    public String getName(){
        return name;
    }
    public String getManufucturer(){
        return this.manufucturer;
    }
    public String getLincence_provider(){
        return this.lincence_provider;
    }
    public Car(){

    }
    public Car(String name,String manufacturer,String licence_provider){
        this.name=name;
        this.manufucturer=manufacturer;
        this.lincence_provider=licence_provider;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setManufucturer(String manufacturer){
        this.manufucturer=manufacturer;
    }

    public void setLincence_provider(String lincence_provider){
        this.lincence_provider=lincence_provider;
    }
    public static void main(String[] args){

        System.out.println();
    }

}