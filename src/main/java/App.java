

import java.util.*;



public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");
        View view = new NewConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {
            boolean flag = true;
            while (flag) {
                System.out.println(" 1 - prev  2 - next 3 - save 4 - add 5 - remove 6 - exit 7 -saveToJson");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":
                        presenter.saveToFile();
                        break;
                    case "4":
                        presenter.add();
                        break;
                    case "5":
                        presenter.remove();
                        break;
                    case "6":
                        flag = false;
                        break;
                    case "7":
                        presenter.saveToFileJSON();
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
