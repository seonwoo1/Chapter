import java.util.Random;
import java.util.Scanner;

public class seonwoo20230746_mid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"가위", "바위", "보"};

        System.out.println("가위바위보 게임을 시작합니다!");
        System.out.println("가위, 바위, 보 중 하나를 선택하세요.");

        System.out.print("당신의 선택은? (가위/바위/보) : ");
        String userChoice = scanner.nextLine();

        int computerIndex = random.nextInt(3);
        String computerChoice = options[computerIndex];

        System.out.println("컴퓨터의 선택: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
                System.out.println("비겼습니다!");
        } else if ((userChoice.equals("가위") && computerChoice.equals("보")) ||
                   (userChoice.equals("바위") && computerChoice.equals("가위")) ||
                   (userChoice.equals("보") && computerChoice.equals("바위"))) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
        
        scanner.close();
    }
}