package lesson02;

/*
Офицер полиции дежурит на мосту и проверяет все проезжающие грузовики на предмет того,
не превышает ли их груз допустимую норму веса.

Метод checkTruck принимает на вход один параметр — объект грузовика Truck,
и определяет, пропустит ли офицер грузовик на мост или нет.
Внутри метода логика достаточно проста: если вес грузовика превышает максимально допустимый,
метод возвращает false. Придется искать другую дорогу :(

Если вес меньше либо равен максимальному, можно проезжать, и метод возвращает true.
 */

public class BridgeOfficer2 {

    int maxWeight = 100;

    public BridgeOfficer2(int normalWeight) {
        this.maxWeight = normalWeight;
    }

    public boolean checkTruck(Truck truck) {
        if (truck.weight > maxWeight) {
            return false;
        } else {
            return true;
        }
    }
}
