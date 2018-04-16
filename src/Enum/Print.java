package Enum;

import java.util.Arrays;
import java.util.Scanner;

public class Print {
    static void printAll(){
        CarType[]carTypes = CarType.values();

        System.out.println("Виберите тип предполагаемого автомобиля \n\"c\" = седан " +
                "\n\"l\" = лимузин \n\"s\" = спорткар \n\"k\" = кроссовер \n\"х\" = хэтчбэк " +
                "для вывода всех моделей автомобилей всех типов нажмитe \"o\"\n" +
                "для получения макс-го/мин-го объема двигателя для типа седан типа авто нажмите \"w\"\n" +
                "для получения макс-го/мин-го объема двигателя для типа лимузин типа авто нажмите \"e\"\n" +
                "для получения макс-го/мин-го объема двигателя для типа спорткар типа авто нажмите \"r\"\n"+
                "для получения макс-го/мин-го объема двигателя для типа кроссовер типа авто нажмите \"t\"\n"+
                "для получения макс-го/мин-го объема двигателя для типа хэтчбэк типа авто нажмите \"y\"\n");
        Scanner sc = new Scanner(System.in);
        char c;
        c = sc.next().charAt(0);
        switch (c){
            case 'w':
                System.out.println("Минимальный обьем двигателя у авто типа седан марки: "
                        + CarType.SEDAN.getCarModel_3() + ", Обьем двигателя cm3: = "
                        + CarType.SEDAN.getEngine_capasity_3());
                System.out.println("Максимальный обьем двигателя у авто типа седан марки: "
                        + CarType.SEDAN.getCarModel_2()
                        + ", Обьем двигателя cm3: = "
                        + CarType.SEDAN.getEngine_capasity_2());
                break;
            case 'e':
                System.out.println("Минимальный обьем двигателя у авто типа лимузин марки: "
                        + CarType.LIMOUSINE.getCarModel_2() + ", Обьем двигателя cm3: = "
                        + CarType.LIMOUSINE.getEngine_capasity_2());
                System.out.println("Максимальный обьем двигателя у авто типа лимузин марки: "
                        + CarType.LIMOUSINE.getCarModel_1()
                        + ", Обьем двигателя cm3: = "
                        + CarType.LIMOUSINE.getEngine_capasity_1());
                break;
            case 'r':
                System.out.println("Минимальный обьем двигателя у авто типа спорткар марки: "
                        + CarType.SPORTCAR.getCarModel_1() + ", Обьем двигателя cm3: = "
                        + CarType.SPORTCAR.getEngine_capasity_1());
                System.out.println("Максимальный обьем двигателя у авто типа спорткар марки: "
                        + CarType.SPORTCAR.getCarModel_3()
                        + ", Обьем двигателя cm3: = "
                        + CarType.SPORTCAR.getEngine_capasity_3());
                break;
            case 't':
                System.out.println("Минимальный обьем двигателя у авто типа кросовер марки: "
                        + CarType.CROSSOVER.getCarModel_1() + ", Обьем двигателя cm3: = "
                        + CarType.CROSSOVER.getEngine_capasity_1());
                System.out.println("Максимальный обьем двигателя у авто типа кросовер марки: "
                        + CarType.CROSSOVER.getCarModel_2()
                        + ", Обьем двигателя cm3: = "
                        + CarType.CROSSOVER.getEngine_capasity_2());
                break;
            case 'y':
                System.out.println("Минимальный обьем двигателя у авто типа хэтчбек марки: "
                        + CarType.HATCHBACK.getCarModel_1() + ", Обьем двигателя cm3: = "
                        + CarType.HATCHBACK.getEngine_capasity_1());
                System.out.println("Максимальный обьем двигателя у авто типа хэтчбек марки: "
                        + CarType.HATCHBACK.getCarModel_2()
                        + ", Обьем двигателя cm3: = "
                        + CarType.HATCHBACK.getEngine_capasity_2());
                break;
            case 'c':
                System.out.println("Тип авто: Седан" + ", Марка авто: "  + CarType.SEDAN.getCarModel_1() + ", Обьем двигателя cm3: = " + CarType.SEDAN.getEngine_capasity_1());
                System.out.println("Тип авто: Седан" + ", Марка авто: "  + CarType.SEDAN.getCarModel_2() + ", Обьем двигателя cm3: = " + CarType.SEDAN.getEngine_capasity_2());
                System.out.println("Тип авто: Седан" + ", Марка авто: "  + CarType.SEDAN.getCarModel_3() + ", Обьем двигателя cm3: = " + CarType.SEDAN.getEngine_capasity_3());
                break;
            case 'l':
                System.out.println("Тип авто: Лимузин" + ", Марка авто: "  + CarType.LIMOUSINE.getCarModel_1() + ", Обьем двигателя cm3: = " + CarType.LIMOUSINE.getEngine_capasity_1());
                System.out.println("Тип авто: Лимузин" + ", Марка авто: "  + CarType.LIMOUSINE.getCarModel_2() + ", Обьем двигателя cm3: = " + CarType.LIMOUSINE.getEngine_capasity_2());
                System.out.println("Тип авто: Лимузин" + ", Марка авто: "  + CarType.LIMOUSINE.getCarModel_3() + ", Обьем двигателя cm3: = " + CarType.LIMOUSINE.getEngine_capasity_3());
                break;
            case 's':
                System.out.println("Тип авто: Спорткар" + ", Марка авто: "  + CarType.SPORTCAR.getCarModel_1() + ", Обьем двигателя cm3: = " + CarType.SPORTCAR.getEngine_capasity_1());
                System.out.println("Тип авто: Спорткар" + ", Марка авто: "  + CarType.SPORTCAR.getCarModel_2() + ", Обьем двигателя cm3: = " + CarType.SPORTCAR.getEngine_capasity_2());
                System.out.println("Тип авто: Спорткар" + ", Марка авто: "  + CarType.SPORTCAR.getCarModel_3() + ", Обьем двигателя cm3: = " + CarType.SPORTCAR.getEngine_capasity_3());
                break;
            case 'k':
                System.out.println("Тип авто: Кроссовер" + ", Марка авто: "  + CarType.CROSSOVER.getCarModel_1() + ", Обьем двигателя cm3: = " + CarType.CROSSOVER.getEngine_capasity_1());
                System.out.println("Тип авто: Кроссовер" + ", Марка авто: "  + CarType.CROSSOVER.getCarModel_2() + ", Обьем двигателя cm3: = " + CarType.CROSSOVER.getEngine_capasity_2());
                System.out.println("Тип авто: Кроссовер" + ", Марка авто: "  + CarType.CROSSOVER.getCarModel_3() + ", Обьем двигателя cm3: = " + CarType.CROSSOVER.getEngine_capasity_3());
                break;
            case 'x':
                System.out.println("Тип авто: Хэтчбэк" + ", Марка авто: "  + CarType.HATCHBACK.getCarModel_1() + ", Обьем двигателя cm3: = " + CarType.HATCHBACK.getEngine_capasity_1());
                System.out.println("Тип авто: Хэтчбэк" + ", Марка авто: "  + CarType.HATCHBACK.getCarModel_2() + ", Обьем двигателя cm3: = " + CarType.HATCHBACK.getEngine_capasity_2());
                System.out.println("Тип авто: Хэтчбэк" + ", Марка авто: "  + CarType.HATCHBACK.getCarModel_3() + ", Обьем двигателя cm3: = " + CarType.HATCHBACK.getEngine_capasity_3());
                break;
            case 'o':
                for (int i = 0; i < carTypes.length; i++) {
                    System.out.println("Тип авто: " + carTypes[i].name() + ", Марка авто: " + carTypes[i].getCarModel_1() + ", Обьем двигателя cm3: = " + carTypes[i].getEngine_capasity_1());
                    System.out.println("Тип авто: " + carTypes[i].name() + ", Марка авто: " + carTypes[i].getCarModel_2() + ", Обьем двигателя cm3: = " + carTypes[i].getEngine_capasity_2());
                    System.out.println("Тип авто: " + carTypes[i].name() + ", Марка авто: " + carTypes[i].getCarModel_3() + ", Обьем двигателя cm3: = " + carTypes[i].getEngine_capasity_3());
                }
        }
    }
}
