public class Main {
    public static void main(String[] args) {
        int paperReserve = 600000;
        int inkReserve = 600000;
        int coverReserve = 2000;
        double printRollerMinTemp = 80.5;
        double printRollerMaxTemp = 120.75;

        int pagesInBook = 530;
        int booksCount = 2000;
        boolean coldPrintingMode = true;
        double printRollerTemp = 200;

        int papersCount  = booksCount * pagesInBook / 2;
        int inkedPapersCount = papersCount + booksCount;

        boolean paperlsEnough = papersCount <= paperReserve;
        boolean inkIsEnought = inkedPapersCount <= inkReserve;
        boolean coversAreEnought = booksCount <= coverReserve;
        boolean rollerTemplsNormal =
                printRollerTemp >= printRollerMinTemp &&
                printRollerTemp <= printRollerMaxTemp;

        boolean errors = false;

        if (!paperlsEnough) {
            errors = true;
            System.out.println("Бумаги недостаточно");
        }
        if (!inkIsEnought) {
            errors = true;
            System.out.println("Чернил недостаточно");
        }
        if (!coversAreEnought) {
            errors = true;
            System.out.println("Обложек не досточно");
        }
        if (!rollerTemplsNormal && !coldPrintingMode) {
            errors = true;
            System.out.println("Неверный режим печати или температура печатающего ролла недопустимая");
                }
        if (errors) {
            System.out.println("Печать запрещена");
        } else {
            System.out.println("Печать разрешена");
        }
    }
}
