package Enum;

public enum CarType {
    SEDAN("Lada Granta", 1600, "Volvo V60", 2400, "Renault Logan", 1400),
    LIMOUSINE("ЗИЛ-41047", 7800, "Mercedes-Benz W100",2300, "Lincoln Town Car", 4600),
    SPORTCAR("Mazda",1300, "Mclaren 570GT",3800, "Bugatti Vision Gran Turismo", 7900),
    CROSSOVER("Renault Duster",1500, "Chevrolet Niva", 1700,"Nissan Terrano", 1600),
    HATCHBACK("Skoda Fabia", 1400, "KIA Ceed",2000 , "Renault Sandero",1450);

    private String CarModel_1, CarModel_2, CarModel_3;
    private int engine_capasity_1, engine_capasity_2, engine_capasity_3;

    CarType(String CarModel_1, int engine_capasity_1,
            String CarModel_2, int engige_capasity_2,
            String CarModel_3, int engige_capasity_3){

        this.CarModel_1 = CarModel_1;
        this.CarModel_2 = CarModel_2;
        this.CarModel_3 = CarModel_3;

        this.engine_capasity_1 = engine_capasity_1;
        this.engine_capasity_2 = engige_capasity_2;
        this.engine_capasity_3 = engige_capasity_3;
    }

    public String getCarModel_1() {
        return CarModel_1;
    }

    public String getCarModel_2() {
        return CarModel_2;
    }

    public String getCarModel_3() {
        return CarModel_3;
    }

    public double getEngine_capasity_1() {
        return engine_capasity_1;
    }

    public double getEngine_capasity_2() {
        return engine_capasity_2;
    }

    public double getEngine_capasity_3() {
        return engine_capasity_3;
    }
}
