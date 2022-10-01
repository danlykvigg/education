package ru.example.education.lesson48;

public enum Season {
    SUMMER(35), AUTUMN(10), WINTER(-25), SPRING(20);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
   }

   public int getTemperature() {
        return temperature;
   }
}
