import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        File src = new File("Games/src");
        if (src.mkdir()) {
            sb.append("Директория " + src.getName() + " создана\n");
        } else {
            sb.append("Директория " + src.getName() + " не создана\n");
        }

        File res = new File("Games/res");
        if (res.mkdir()) {
            sb.append("Директория " + res.getName() + " создана\n");
        } else {
            sb.append("Директория " + res.getName() + " не создана\n");
        }

        File savegames = new File("Games/savegames");
        if (savegames.mkdir()) {
            sb.append("Директория " + savegames.getName() + " создана\n");
        } else {
            sb.append("Директория " + savegames.getName() + " не создана\n");
        }

        File temp = new File("Games/temp");
        if (temp.mkdir()) {
            sb.append("Директория " + temp.getName() + " создана\n");
        } else {
            sb.append("Директория " + temp.getName() + " не создана\n");
        }

        File main = new File("Games/src/main");
        if (main.mkdir()) {
            sb.append("Директория " + main.getName() + " создана\n");
        } else {
            sb.append("Директория " + main.getName() + " не создана\n");
        }

        File test = new File("Games/src/test");
        if (test.mkdir()) {
            sb.append("Директория " + test.getName() + " создана\n");
        } else {
            sb.append("Директория " + test.getName() + " не создана\n");
        }

        File javaMain = new File(main, "Main.java");
        try {
            if (javaMain.createNewFile()) {
                sb.append("Файл " + javaMain.getName() + " создан\n");
            }
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }

        File javaUtils = new File(main, "Utils.java");
        try {
            if (javaUtils.createNewFile()) {
                sb.append("Файл " + javaUtils.getName() + " создан\n");
            }
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }

        File drawables = new File("Games/res/drawables");
        if (drawables.mkdir()) {
            sb.append("Директория " + drawables.getName() + " создана\n");
        } else {
            sb.append("Директория " + drawables.getName() + " не создана\n");
        }

        File vectors = new File("Games/res/vectors");
        if (vectors.mkdir()) {
            sb.append("Директория " + vectors.getName() + " создана\n");
        } else {
            sb.append("Директория " + vectors.getName() + " не создана\n");
        }

        File icons = new File("Games/res/icons");
        if (icons.mkdir()) {
            sb.append("Директория " + icons.getName() + " создана\n");
        } else {
            sb.append("Директория " + icons.getName() + " не создана\n");
        }

        File txtTemp = new File(temp, "temp.txt");
        try {
            if (txtTemp.createNewFile()) {
                sb.append("Файл " + txtTemp.getName() + " создан\n");
            }
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }

        try (FileWriter fw = new FileWriter(txtTemp)) {
            fw.write(sb.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
