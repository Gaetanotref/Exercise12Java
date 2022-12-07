public class Person {

    private String name;
    private String surname;
    private double height;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight(double v) {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDetails(){
        System.out.println("The name is "+name+" the surname is "+surname+" the height is "+height+" the age is "+age);
    }
}
