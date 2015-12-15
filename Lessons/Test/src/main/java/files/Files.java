package files;

import java.io.File;

/**
 * Created by uitschool JV on 12/11/2015.
 */
public class Files {
    public static void main(String[] args) {
        File file = new File("Lesson13.txt");
        if(file.exists()){

        }else{
            try {
                file.createNewFile();
            }catch (Exception e) {
                System.out.println("File cannot be created");
                e.printStackTrace();//сообщение об ошибке
            }
        }
    }
}
