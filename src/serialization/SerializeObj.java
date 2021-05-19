package serialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializeObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        char section = 'a';
        String school = "jnv dkl";
        int marks = sc.nextInt();
        SerialObject so = new SerialObject(id, name, section, marks, school);
//        File f = new File("C:/Users/admin/codePractice/java_repo/core_java_from_scratch_studytonight/serial.txt");
//        serialize
        try {
            String path = "C:/Users/admin/codePractice/java_repo/core_java_from_scratch_studytonight/serial.txt";
            FileOutputStream fos = new FileOutputStream(path);
//            write using byte stream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(so);
//            writes to file using character stream
//            fos.write("ID,NAME,MARKS\n".getBytes());
//            fos.write((so.getId()+","+so.getName()+","+so.getMarks()+"\n").getBytes());
            fos.flush();
            fos.close();
            System.out.println("Complete.");

        } catch (Exception e) {
            e.printStackTrace();
        }
//        deserialize
//        try{
//            FileInputStream fis = new FileInputStream("C:/Users/admin/codePractice/java_repo/core_java_from_scratch_studytonight/serial.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            SerialObject os = (SerialObject) ois.readObject();
//            os.showInfo();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}

class SerialObject implements Serializable {
    static char section;
    static String school;
    private int id;
    private String name;
    private transient int marks;

    public SerialObject(int id, String name, char section, int marks, String school) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.marks = marks;
        this.school = school;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public int getMarks(){
        return this.marks;
    }


    public void showInfo() {
        System.out.println("id: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("section: " + section);
        System.out.println("marks: " + marks);
        System.out.println("school: " + school);
    }


}
