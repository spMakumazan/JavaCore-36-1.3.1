import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        List<String> directories = new ArrayList<>();

        directories.add("C://Games/src");
        directories.add("C://Games/res");
        directories.add("C://Games/savegames");
        directories.add("C://Games/temp");
        directories.add("C://Games/src/main");
        directories.add("C://Games/src/test");
        directories.add("C://Games/res/drawables");
        directories.add("C://Games/res/vectors");
        directories.add("C://Games/res/icons");

        for (String directory : directories) {
            createDirectory(directory);
        }

        createFile("C://Games/src/main", "Main.java");
        createFile("C://Games/src/main", "Utils.java");
        createFile("C://Games/temp", "temp.txt");

        try (FileWriter fw = new FileWriter("C://Games/temp/temp.txt")) {
            fw.write(sb.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createDirectory(String directoryName) {
        File directory = new File(directoryName);
        if (directory.mkdir()) {
            sb.append("Директория " + directory.getName() + " создана\n");
        } else {
            sb.append("Директория " + directory.getName() + " не создана\n");
        }
    }

    public static void createFile(String directoryName, String fileName) {
        File file = new File(directoryName, fileName);
        try {
            if (file.createNewFile()) {
                sb.append("Файл " + file.getName() + " создан\n");
            }
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }
    }
}
