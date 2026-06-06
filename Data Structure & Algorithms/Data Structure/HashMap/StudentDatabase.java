import java.util.HashMap;
class StudentDatabase{
    public static void main(String[] args){
        HashMap<Integer,String> students=new HashMap<>();
        students.put(101,"Anushka");
        students.put(102,"Sneha");
        students.put(103,"Samarth");
        System.out.println("All students");
        System.out.println(students);
        System.out.println("student with roll no 102:"+students.get(102));
        students.remove(103);
        System.out.println("After removing roll no 103:");
        System.out.println(students);
         if (students.containsKey(101)) {
            System.out.println("Roll no 101 exists");
         }
        }
}