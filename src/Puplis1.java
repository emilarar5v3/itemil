public class Puplis1 {
 private    String name ;
 private  int age ;
 private    double weith ;
 private   String color ;
  private   String  talent ;

    public Puplis1(String name, int age, double weith, String color, String talent) {
        this.name = name;
        this.age = age;
        this.weith = weith;
        this.color = color;
        this.talent = talent;
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

    public double getWeith() {
        return weith;
    }

    public void setWeith(double weith) {
        this.weith = weith;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String  getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    @Override
    public String toString() {
        return "Puplis1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weith=" + weith +
                ", color='" + color + '\'' +
                ", talent='" + talent + '\'' +
                '}';
    }
}
