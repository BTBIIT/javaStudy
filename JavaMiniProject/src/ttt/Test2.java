package ttt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        // 파일 경로를 지정된 디렉토리로 변경
        String[] filePaths = {
            "C:\\JAVA_LAB\\JavaMiniProject\\src\\ttt\\summary.txt",
            "C:\\JAVA_LAB\\JavaMiniProject\\src\\ttt\\exercise.txt",
            "C:\\JAVA_LAB\\JavaMiniProject\\src\\ttt\\money.txt"
        };

        String[] startMarkers = {
            "==== 오늘의 날씨 ====",
            "==== 오늘 운동한 시간 ====",
            "==== 소비 내역 ===="
        };

        // 각 파일의 현재 라인 번호를 저장할 Map
        Map<String, Integer> lineCounters = new HashMap<>();

        // 파일 경로와 해당 파일의 BufferedReader를 저장할 Map
        Map<String, BufferedReader> readers = new HashMap<>();

        try {
            // 각 파일에 대해 BufferedReader 생성 및 초기 라인 번호 설정
            for (String filePath : filePaths) {
                readers.put(filePath, new BufferedReader(new FileReader(filePath)));
                lineCounters.put(filePath, 0);
            }

            boolean continueReading;

            do {
                continueReading = false;

                for (int i = 0; i < filePaths.length; i++) {
                    String filePath = filePaths[i];
                    String startMarker = startMarkers[i];
                    BufferedReader br = readers.get(filePath);

                    if (br == null) {
                        continue; // 이미 파일이 닫혔으면 건너뜀
                    }

                    int currentLineNumber = lineCounters.get(filePath);
                    String line;
                    boolean sectionStarted = false;
                    boolean sectionRead = false;

                    // 지정된 구분자 이후의 섹션을 읽음
                    while ((line = br.readLine()) != null) {
                        currentLineNumber++;

                        if (line.equals(startMarker)) {
                            if (sectionStarted) {
                                // 이미 섹션을 읽었으면 이 파일의 섹션은 끝난 것
                                lineCounters.put(filePath, currentLineNumber - 1);
                                break;
                            } else {
                                // 섹션 시작
                                sectionStarted = true;
                                sectionRead = true;
                                System.out.println(line);
                            }
                            continue;
                        }

                        if (sectionStarted) {
                            // 섹션 내용을 출력
                            System.out.println(line);

                            // 다음 구분자를 만나면 현재 섹션이 끝난 것으로 간주
                            for (String marker : startMarkers) {
                                if (line.equals(marker) && !line.equals(startMarker)) {
                                    lineCounters.put(filePath, currentLineNumber - 1);
                                    sectionStarted = false;
                                    break;
                                }
                            }
                        }

                        if (!sectionStarted && sectionRead) {
                            break;
                        }
                    }

                    if (sectionRead) {
                        // 섹션을 읽었으면 계속 루프를 돌도록 설정
                        continueReading = true;
                        lineCounters.put(filePath, currentLineNumber);
                    }

                    // 파일의 끝에 도달한 경우 BufferedReader를 닫음
                    if (line == null) {
                        br.close();
                        readers.remove(filePath);
                    }
                }
            } while (continueReading);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 모든 BufferedReader를 닫음
            for (BufferedReader br : readers.values()) {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
