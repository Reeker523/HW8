//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
System.out.println("Задача 1");        // to see how IntelliJ IDEA suggests fixing it.
int firstFriday = 5;
int i = 1;
for(; i <=31; i++) {
    if((i - firstFriday) % 7 == 0 )
        System.out.println("Сегодня пятница " + i + " число. Необходимо подготовить отчет" );
}
firstFriday += 7;
System.out.println("Задача 2");
System.out.println("Решение 1");
int totalDistance = 42195;
int distance = 500;
int distanceTravelled = 0;
do {
    System.out.println("Держитесь! Осталось " + totalDistance + " метров ");
    totalDistance = totalDistance - distance;
    distanceTravelled = distanceTravelled = distance;
}   while (totalDistance>0);
System.out.println("Решение 2");
int myDistance = 0;
int allDistance = 42195;
for (; myDistance < allDistance; myDistance += 500) {
    System.out.println("Держитесь! Осталось " + (allDistance - myDistance) + " метров");
}
System.out.println("Задача 3");
int money = 1000;
int days = 0;
for (; money > 0 ; money -= 100) {
    days++;
    if (days % 5 == 0)
    {
        continue;
    }
    System.out.println(" На счету " + money +  " рублей " + days +  " день Вы можете оставить автомобиль.");
    }
System.out.println("Задача 4");
int month = 0;
int total = 0;
int bonusSalary = 15000;
while (true) {
    month++;
    if (month % 6 == 0) {
        total = total + total / 100 * 7;
    }
    total = total + bonusSalary;
    if (total >= 12000000) {
        break;
    }
    System.out.println(" Месяц " + month + " накоплений " + total);
}
        System.out.println(" Цель достигнута! Понадобилось " + month + " месяца ");
System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute = minute + 1;
            if (minute % 10 == 0) {
                overheats = overheats + 1;
                if (overheats == 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                System.out.println("Перегрев! Зарядка приостановлена на 2 минуты.");
                minute = minute + 1;
                continue;
            }
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут.");
 }
    }



