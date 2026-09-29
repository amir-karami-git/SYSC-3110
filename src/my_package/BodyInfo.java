package my_package;
public class BodyInfo {

    private String name;

    public BodyInfo(){
        this.name = "Unknown";
    }
    public BodyInfo(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
