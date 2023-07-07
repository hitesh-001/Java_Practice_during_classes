class Students {
    int id;
    static String name="Hitesh";
    Students(int id){
        this.id=id;
       // this.name=name;
    }
    public void display(){
        System.out.println("id :"+ id);
        System.out.println("name :"+name);
    }
}
public class Developer {
    public static void main(String[] args) {
        Students s1=new Students(1);
        // s1.id=1;
        // s1.name="Hitesh";
        Students s2=new Students(2);
        // s2.id=2;
        // s2.name="Goyal";
        s1.display();
        s2.display();
    }
}
