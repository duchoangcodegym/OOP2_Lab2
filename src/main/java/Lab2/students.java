package Lab2;

public class students {
    private  String name;
    private int age;
    private String accommodation;

    public students (){

    }
    public students(String namr ,int age,String accommodation){
        this.name= namr;
        this.age=age;
        this.accommodation=accommodation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }
}

