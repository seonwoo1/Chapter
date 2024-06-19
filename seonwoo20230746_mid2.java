import java.util.Scanner;

public class seonwoo20230746_mid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("~~~~~~~~묵찌빠 게임을 시작합니다~~~~~~~~~~");
            System.out.println("1.게임시작  2.게임종료");
            System.out.print("입력 : ");
            int choice = scanner.nextInt();

            if (choice == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            } else if (choice == 1) {
                int userChoice, computerChoice;
                boolean userTurn = true;

                while (true) {
                    System.out.println("~~~~~~~~~가위 바위 보~~~~~~~~~~~");
                    System.out.println("1.가위 2.바위 3.보");
                    System.out.print("입력 : ");
                    userChoice = scanner.nextInt();
                    computerChoice = (int) (Math.random() * 3) + 1;

                    System.out.println("컴퓨터: " + (computerChoice == 1 ? "가위" : computerChoice == 2 ? "바위" : "보"));
                    if (userChoice == computerChoice) {
                        System.out.println("비겼습니다. 다시 가위바위보를 합니다.");
                    } else if ((userChoice == 1 && computerChoice == 3) || 
                               (userChoice == 2 && computerChoice == 1) || 
                               (userChoice == 3 && computerChoice == 2)) {
                        System.out.println("당신이 이겼습니다. 당신이 먼저 공격합니다.");
                        userTurn = true;
                        break;
                    } else {
                        System.out.println("당신이 졌습니다. 컴퓨터가 먼저 공격합니다.");
                        userTurn = false;
                        break;
                    }
                }

                while (true) {
                    System.out.println("================묵 찌 빠================");
                    if (userTurn) {
                        System.out.println("=============플 레 이 어 차 례=============");
                    } else {
                        System.out.println("==============컴 퓨 터 차 례==============");
                    }
                    System.out.println("1.묵 2.찌 3.빠");
                    System.out.print("입력 : ");
                    userChoice = scanner.nextInt();
                    computerChoice = (int) (Math.random() * 3) + 1;

                    System.out.println("컴퓨터: " + (computerChoice == 1 ? "묵" : computerChoice == 2 ? "찌" : "빠"));

                    if (userChoice == computerChoice) {
                        if (userTurn) {
                            System.out.println("당신이 이겼습니다!");
                        } else {
                            System.out.println("당신이 졌습니다.");
                        }
                        break;
                    } else {
                        if ((userChoice == 1 && computerChoice == 3) || 
                            (userChoice == 2 && computerChoice == 1) || 
                            (userChoice == 3 && computerChoice == 2)) {
                            userTurn = false;
                        } else {
                            userTurn = true;
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}