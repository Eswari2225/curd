import java.util.*;
public class curd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();
        boolean op = true;
        while (op == true){
            System.out.println("Enter the Option:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int n = sc.nextInt();

            switch (n){
                case 1:{
                    addStudent(list,sc);

                    break;
                }

                case 2:{
                    displayStudent(list,sc);
                    break;
                }

                case 3:{
                    updateStudent(list,sc);
                    break;
                }

                case 4:{
                    deleteStudent(list,sc);
                    break;
                }

                case 5:{
                    op = false;
                    break;
                }
            }
        }
    }

    public static void addStudent(ArrayList<Student> list ,Scanner sc){
        System.out.println("Enter the number of COUNT to Add:");
        int count = sc.nextInt();
        for(int i = 0; i<count; i++){
            System.out.println("Enter the ID:");
            int id = sc.nextInt();
            System.out.println("Enter the name:");
            String name = sc.next();
            System.out.println("Enter the mark:");
            double mark = sc.nextDouble();

            list.add(new Student(id,name,mark));
        }
    }

    public static void displayStudent(ArrayList<Student> list ,Scanner sc){
        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

    public static void updateStudent(ArrayList<Student> list ,Scanner sc){
        System.out.println("Enter the ID to Update");
        int id = sc.nextInt();
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the mark");
        int mark = sc.nextInt();

        for(Student s: list){
            if(s.getId() == id){
                s.setName(name);
                s.setMark(mark);
                break;
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> list ,Scanner sc){
        System.out.println("Enter the ID to Delete");
        int id = sc.nextInt();

        for(Student s: list){
            if(s.getId() == id){
                list.remove(s);
                break;
            }
        }
    }
}

class Student{
    private int id;
    private String name;
    private double mark;

    Student(int id, String name, double mark){
        this.id=id;
        this.name=name;
        this.mark=mark;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setMark(double mark){
        this.mark = mark;
    }
    public double getMark(){
        return mark;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public String toString(){
        return "Id: " +id+" "+ "Name: "+ name+ " "+ "mark: " + mark;
    }

}
