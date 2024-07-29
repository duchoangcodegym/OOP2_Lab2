package Lab2;

public class Mainkethua  {
    public static void main(String[] args) {
        students students = new students();
        students students1 = new students("Nam",13,"Hai Phong");
        students students2 = new students("Hung", 20,"Hai Phong");
        System.out.println("Tên sinh viên : " + students1.getName());
        System.out.println("Tuổi :"+ students1.getAge());
        System.out.println("Nơi ở :" + students1.getAccommodation());

    }
}
