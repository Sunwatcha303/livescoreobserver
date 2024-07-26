import java.util.Scanner;

public class LiveScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SourceLiveScore soure = new SourceLiveScore();

        TrueVision trueVision = new TrueVision();
        PPTV pptv = new PPTV();

        soure.register(trueVision);
        soure.register(pptv);

        System.out.print("Enter Score: ");
        String liveScore = sc.nextLine();

        while (!liveScore.equals("")) {
            soure.setLiveScore(liveScore);

            System.out.print("Enter Score: ");
            liveScore = sc.nextLine();
        }

        sc.close();
    }
}
