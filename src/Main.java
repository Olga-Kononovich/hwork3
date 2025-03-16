public class Main {
    public static void main(String[] args) {
        byte red=87;
        System.out.println("Значение переменной red с типом byte равна" + red);
        int blak=87541;
        System.out.println("Значение переменной blak с типом int" + blak);
        short green=15456;
        System.out.println("Значение переменной green с типом short" + green);
        long blue=1235647;
        System.out.println("Значение переменной blue с типом long" + blue);
        float white=4.5f;
        System.out.println("Значение переменной white с типом float" + white);
        double browen=2.86542125;
        System.out.println("Значение переменной browen с типом browen"+ browen);


        byte one=67;
        System.out.println(one);
        short two=569;
        System.out.println(two);
        float three=-159;
        System.out.println(three);
        long four=27897l;
        System.out.println(four);
        long five=987687965549l;
        System.out.println(five);
        float six=27.12f;
        System.out.println(six);
        float sewen=2.786f;
        System.out.println(sewen);


        byte lp=23;
        byte as=27;
        byte ek=30;
        int students=lp+as+ek;
        System.out.println(students);
        int paper=480;
        int all=paper/students;
        System.out.println("На каждого ученика рассчитано " + all+ " листов бумаги");



        byte alt=16;
        byte min=2;
        int pr=alt/min;
        System.out.println(pr);
        byte tm=20;
        int total=pr*tm;
        System.out.println("за 20 минут машина произвела "+ total+ "штук бутылок");
        short tm2=1440;
        int day=pr*tm2;
        System.out.println("за сутки машина производит "+ day+ " штук бутылок");
        short tm3=4320;
        int day2=tm3*pr;
        System.out.println("за 3 дня машина произведет "+ day2+ " штук бутлок");
        int tm4 =43200;
        int day3=tm4*pr;
        System.out.println("за месяц машина произведет "+ day3 +"штук бутолок");



        byte just=120;
        byte white1=2;
        byte brawn1=4;
        int form=white1+brawn1;
        System.out.println("на 1 класс уходит "+ form+" банок краски");
        int cr=just/form;
        int wp=cr*white1;
        int bp=cr*brawn1;
        System.out.println("В школе где "+cr+" классов ,нужно "+ wp+" белой краски и"+ bp+" банок коричневой краски");


        byte a=5;
        byte b=80;
        int ban=a*b;
        System.out.println("вес банана"+ban);
        byte a1=100;
        byte b1=105;
        short milk=200;
        int milkWeight=milk/a1*b1;
        System.out.println("вес молока"+ milkWeight);
        byte a2=2;
        byte b2=100;
        int ice=a2*b2;
        System.out.println("вес мороженного"+ ice);
        byte a3=4;
        byte b3=70;
        int egg=a3*b3;
        System.out.println("вес яиц"+egg);
        long coc=milk+ban+ice+egg;
        System.out.println("вес коктеля"+ coc);
        float coc2=coc/1000f;
        System.out.println(coc2+ " вес в кг");


        byte dAy=7;
        short kg9=1000;
        int gram=kg9*dAy;
        System.out.println(gram);
        int day7=gram/250;
        System.out.println(day7+ " дней понадобится спортсмену при потере 250 гр в день");
        int day8=gram/500;
        System.out.println(day8+ " днй понадобится спортсмену при потере 500 гр в день");
        short averageValue=(250+500)/2;
        System.out.println(averageValue);
        int averageValue1= averageValue*dAy;
        System.out.println(averageValue1+ "грамм, среднее значение потери веса за 7 дней");



        int M=67760;
        int M1=M/10;
        int M3=M+M1;
        int M4=M3*12;
        int M5=M*12;
        int M6=M4-M5;
        System.out.println("маша получает теперь "+ M4+ " рублей.Годовой доход вырос на "+ M6 +" рублей");

        int d=83690;
        int d1=d/10;
        int d3=d1+d;
        int d4=d3*12;
        int d5=d*12;
        int d6=d4-d5;
        System.out.println("денис получает теперь" + d4+ "рублей.Годовой доход вырос на " + d6 +" рублей");

        int k=76230;
        int k1=k/10;
        int k3=k1+k;
        int k4=k3*12;
        int k5=k*12;
        int k6=k4-k5;
        System.out.println("кристина получает теперь"+ k4 +"рублей.Годовой доход вырос на "+ k6 +"рублей");
    }
}