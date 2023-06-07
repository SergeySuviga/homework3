
public class Main   {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

        public static void task1() {

            System.out.println("Задача 1");
            byte human = 50;

            System.out.println("Значение переменной" + " a" + " с типом" + " byte"+ " равно " + human + ".");

            short fish = 20000;

            System.out.println("Значение переменной" + " b" + " с типом" + " short" + " равно " + fish + ".");

            int stars = 1555222555;
            System.out.println("Значение переменной" + " с" + " с типом" + " int" + " равно " + stars + ".");

            long planets = 5255555;
            System.out.println("Значение переменной" + " d" + " с типом" + " long" + " равно " + planets + ".");

            float juice = 2.50f;
            System.out.println("Значение переменной" + " e" + " с типом" + " float" + " равно " + juice + ".");

            double water = 3.25;
            System.out.println("Значение переменной" + " f" + " с типом" + " double " + " равно " + water + ".");


    }

            public static void task2() {
            System.out.println("Задача 2");
            byte a = 67;
            short b = 159;
            int c = 27897;
            long d = 987678965549L;
            float e = 2.786f;
            double f = 27.12;

    }
            public static void task3(){
            System.out.println("Задача 3");
            byte Ludmila = 23;
            byte Anna = 27;
            byte Ekaterina = 30;
            long paper = 480;
            System.out.println(Ludmila+Anna+Ekaterina);
            int paper1 = (480 / (Ludmila + Anna + Ekaterina));
                        System.out.println("На каждого ученика рассчитано " +paper1+ " листов бумаги" + ".");
            }

            public static void task4(){
            System.out.println("Задача 4");
              //Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты
                byte standart = 16;
                byte standart2 = 2;

                //1 мин
                int min = standart / standart2;

                //за 20 минут
                int conditionOne = min * 20;
                System.out.println("За " +20 + " минут машина произвела " + conditionOne+ " штук бутылок" +".");
                //за один час
                int hour = min * 60;
                //Минут в сутках
                int minuteInDay = 60*24;
                //за сутки (24 часа)
                int day = minuteInDay * hour;
                System.out.println("За сутки машина произвела " + day+ " штук бутылок" +".");

                //за 3 дня
                int threeВays = 24*3;
                int quarter = minuteInDay * threeВays;
                int quarterBottle = quarter * min;
                System.out.println("За три дня машина произвела " + quarterBottle+ " штук бутылок" +".");

                //За один месяц
                int month = minuteInDay * 31;
                int monthBottle = month * min;
                System.out.println("За один месяц машина произвела " + monthBottle+ " штук бутылок" +".");
            }

    public static void task5(){
        System.out.println("Задача 5");
        int scool = 120 / 6;
        int classA =scool * 4;
        int classB =scool * 2;

        System.out.println("В школе, где " +scool+ " классов, нужно " +classA+ " банок белой краски и " +classB+
                        " банок коричневой краски.");
    }


    public static void task6(){
        System.out.println("Задача 6");

        int Bananas = 5;//1 банан 80 гра
        int Milk = 200; //100мл =105гр
        int IceCream = 2;  //2 по 100гр
        int RawEggs = 4; // 1 яцо = 70 гр

        int ingredients1 = 5*80;  //   cocktail
        System.out.println(ingredients1);
        int ingredients2 = 100*105;
        System.out.println(ingredients2);
        int ingredients3 = 100*2;
        System.out.println(ingredients3);
        int ingredients4 = 4*70;
        System.out.println(ingredients4);

        int cocktail = ingredients1+ingredients2+ingredients3+ingredients4;

        float cocktail2 = cocktail / 1000f;
        System.out.println(cocktail2);
        System.out.println("Вес коктейля для спортсмена составляет " +cocktail+ "грамм или " +cocktail2+ " килограмм.");



    }

    public static void task7(){
        System.out.println("Задача 7");
        int totalWeight = 7;// общий вес / 7000 гр
        int gramms = 7*1000;
        int weightLoss1 = 250; //похудение на 250гр
        int weightLoss2 = 500; //похудение на 500гр
        int tyme = 24;
        int loss1 = 24*gramms/weightLoss1;
        int loss2 = 24*gramms/weightLoss2;
        System.out.println("Спортсмену может потребоваться " +loss1+ " дня сбрасывая веса по " +weightLoss1+ " грамм чтобы добиться результата похудения," +
                "или " +loss2+ " дней по " +weightLoss2 + " грамм.");

    }


    public static void task8(){
        System.out.println("Задача 8");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int mashaIncome = (int) (masha * 0.10);
        int mashaIncome2 = masha + mashaIncome;
        int mashaYear = mashaIncome2 * 12;
        int mashaDifference1 = masha * 12;
        int mashaDifference2 = mashaYear - mashaDifference1;
        System.out.println("Маша теперь получает " +mashaIncome2+ " рублей. " + "Годовой доход вырос на " +mashaDifference2+
                " рублей.");

        int kristinaIncome = (int) (kristina * 0.10);
        int kristinaIncome2 = kristina + kristinaIncome;
        int kristinaYear = kristinaIncome2 * 12;
        int kristinaDifference1 = kristina * 12;
        int kristinaDifference2 = kristinaYear - kristinaDifference1;
        System.out.println("Кристина теперь получает " +kristinaIncome2+ " рублей. " + "Годовой доход вырос на " +kristinaDifference2+
                " рублей.");

        int denisIncome = (int) (denis * 0.10);
        int denisIncome2 = denis + denisIncome;
        int denisYear = denisIncome2 * 12;
        int denisDifference1 = denis * 12;
        int denisDifference2 = denisYear - denisDifference1;
        System.out.println("Денис теперь получает " +denisIncome2+ " рублей. " + "Годовой доход вырос на " +denisDifference2+
                " рублей.");


    }





}


