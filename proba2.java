import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class proba2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);
        
        StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    stringBuilder.append("TEST ");
                }
                
        pw.println(stringBuilder);
        
        pw.close();
            
                
    }

    
}