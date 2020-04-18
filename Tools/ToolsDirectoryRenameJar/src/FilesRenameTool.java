import java.io.File;

public class FilesRenameTool {
    public static void main(String[] args) {
        File file = new File("F:\\相机照片");
//        File file = new File("D:\\wallpaper");
        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            for (File f : fileList) {
                if (f.isDirectory()) {
                    File[] picFile = f.listFiles();
                    for (File pic : picFile) {
                        renameFile(f.getPath(), pic.getName(), f.getName() + "_" + pic.getName());
                    }
                }
            }
        }
    }

    private static void renameFile(String path, String oldName, String newName) {
        System.out.println("---------------path=" + path + ",   oldName=" + oldName + ",    newName=" + newName + ",pathSeparator=" + File.separator);
        if (!oldName.equals(newName)) {
            File oldFile = new File(path + File.separator + oldName);
            File newFile = new File(path + File.separator + newName);
            if (!oldFile.exists()) {
                return;
            }
            if (!newFile.exists()) {
                oldFile.renameTo(newFile);
            }
        }
    }
}
