package PriorityQueuePattern;

public class Test {
    public static void main(String[] args) {
        Request request = new Request(5);
        firstBot(request.getImportance());
        secondBot(request.getImportance());
        thirdBot(request.getImportance());
    }

    public static void firstBot(int importance) {
        if (importance >= 0 && importance < 5) {
            System.out.println("Case resolved, bot 1");
        }
    }

    public static void secondBot(int importance) {
        if (importance >= 5 && importance < 7) {
            System.out.println("Case resolved, bot 2");
        }
    }

    public static void thirdBot(int importance) {
        if (importance >= 7 && importance < 10) {
            System.out.println("Case resolved, bot 3");
        }
    }
}
