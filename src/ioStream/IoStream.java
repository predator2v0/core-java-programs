package ioStream;

import java.io.*;

public class IoStream {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = ' ';
        int cha = 0;
//        reading character from console.
        try{
//            read() throws IOException hence put inside a try block.
//            read() returns a int value i.e. ASCII value of input character. hence need to be type casted to corresponding char;
//            the read() method reads only a single character from the console input.
            cha = br.read();
            ch = (char)cha;
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(ch);
        System.out.println(cha);
//        reading String from console using CharacterStream
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        String str = null;
        try{
            str = bfr.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(str);

        //        writing into the file using CharacterStream
        try{
            File fw = new File("C:/Users/admin/codePractice/java_repo/core_java_from_scratch_studytonight/IoTestFile.txt");
            FileWriter wFile = new FileWriter(fw);
            System.out.println("enter a Strng you want to write into the file: ");
            BufferedReader bffrr = new BufferedReader(new InputStreamReader(System.in));
            String fileString = bffrr.readLine();
            wFile.write(fileString);

            wFile.close();

        }catch (Exception e){
            e.printStackTrace();
        }


//        reading from file using CharacterStream
        try{
            File fr = new File("C:/Users/admin/codePractice/java_repo/core_java_from_scratch_studytonight/IoTestFile.txt");
            BufferedReader rFile = new BufferedReader(new FileReader(fr));
            String fileChar ;
            while ((fileChar = rFile.readLine())!= null){
                System.out.println(fileChar);
            }

            rFile.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
