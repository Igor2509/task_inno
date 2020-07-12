package ru.vechkanov.lesson15.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCommander {
     File file;
     String nameFile;

    public FileCommander(String name) throws IOException {
         file = new File(name);
         boolean isCreateFile = file.createNewFile();
         if (isCreateFile) {
             System.out.printf("Файл %s создан\n", file.getName());
         } else {System.out.println("ничего не получилось");}

         this.nameFile = name;
    }


    public void renameFile(String name){
        File newFile = new File(name);
        boolean isRenameFile = file.renameTo(newFile);
        file = newFile;
        if (isRenameFile) {
        System.out.printf("Файл %s переименован в файл %s\n", nameFile, name);
        } else {
            System.out.println("ничего не получилось");

        }


    }


    public void copyFile(String path) throws IOException{
       Path namePath =  Files.copy(file.toPath(), new File(path).toPath());
       System.out.printf("Файл скопирован в %s\n", namePath);

    }

    public void deleteFile(){
        boolean isDeleteFile = file.delete();
        if (isDeleteFile) {
            System.out.printf("Файл %s удален", file.getName());
        } else {System.out.println("ничего не получилось");}

    }



}
