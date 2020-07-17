package ru.vechkanov.lesson18;



import java.io.*;
import java.nio.charset.Charset;



public class Coder {
    String filename1;
    String charset1;
    String filename2;
    String charset2;

    public Coder(String filename1, String charset1, String filename2, String charset2) {
        this.filename1 = filename1;
        this.charset1 = charset1;
        this.filename2 = filename2;
        this.charset2 = charset2;
    }

    public void coder() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename1), Charset.forName(charset1)));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename2), Charset.forName(charset2)))) {
             String brLine;
                while ((brLine = br.readLine()) != null) {
                    bw.write(brLine + "\n");



            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

