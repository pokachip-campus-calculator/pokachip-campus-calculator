package com.pokachip.campus; // 팀 번호에 맞게 변경

import com.pokachip.campus.GradeService;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("===== 대학생활 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.println("2. 학점 계산");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 2: {
                    System.out.println("과목 1 점수 : ");
                    int score1 = sc.nextInt();

                    System.out.println("과목 2 점수 : ");
                    int score2 = sc.nextInt();

                    System.out.println("과목 3 점수 : ");
                    int score3 = sc.nextInt();

                    GradeService service = new GradeService();
                    String result = service.makeReport(score1, score2, score3);

                    System.out.println(result);

                    break;
                }

                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();
        } while (menu != 0);
    }
}