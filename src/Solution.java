/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String fileName = reader.readLine();
                FileInputStream fileReader = new FileInputStream(fileName);
                if (fileReader.available() < 1000) {
                    fileReader.close();
                    throw new DownloadException();
                }
                else {
                    byte[] buffer = new byte[fileReader.available()];
                    int count = fileReader.read(buffer);
                }
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    public static class DownloadException extends Exception {

    }
}