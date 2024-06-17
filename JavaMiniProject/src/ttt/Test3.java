package ttt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        String[] files = {"summary.txt", "exercise.txt", "money.txt"};
        int[] lineNums = new int[files.length];

        try {
            BufferedReader[] readers = new BufferedReader[files.length];
            int[] fileLineCounts = new int[files.length]; // 각 파일의 현재 읽은 줄 수를 저장하는 배열

            // 파일 리더 초기화
            for (int i = 0; i < files.length; i++) {
                readers[i] = new BufferedReader(new FileReader("C:\\JAVA_LAB\\JavaMiniProject\\src\\ttt\\" + files[i]));
            }

            boolean hasNextLine = true;
            while (hasNextLine) {
                hasNextLine = false;
                for (int i = 0; i < files.length; i++) {
                    String line = readers[i].readLine();
                    if (line != null) {
                        hasNextLine = true;
                        lineNums[i]++;
                        fileLineCounts[i]++;
                        if (lineNums[i] == 1) {
                            System.out.println("==== " + files[i] + " ====");
                        }
                        System.out.println(line);
                    } else {
                        // 파일의 끝에 도달했을 때 다음 파일로 넘어감
                        lineNums[i] = 0; // 라인 수 초기화
                        // 파일을 다 읽었을 때는 해당 파일의 읽은 줄 수를 출력하고 다시 0으로 초기화
                        if (fileLineCounts[i] > 0) {
                            System.out.println("Total lines read from " + files[i] + ": " + fileLineCounts[i]);
                            fileLineCounts[i] = 0;
                        }
                        // 다음 파일로 넘어가기
                        if (i < files.length - 1) {
                            System.out.println(); // 파일 간 구분을 위해 빈 줄 출력
                        }
                    }
                }
            }

            // 모든 파일 닫기
            for (int i = 0; i < files.length; i++) {
                readers[i].close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
