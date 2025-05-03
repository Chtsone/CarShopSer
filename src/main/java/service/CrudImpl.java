package service;

import entity.Car;

import java.util.HashMap;
import java.util.Scanner;

public class CrudImpl implements CrudInterf
    {

        @Override
        public void create(Scanner scanner, HashMap<Integer, Car> carList)
            {
                System.out.println("выбрали добавить");
                System.out.println("Введите Марку");
                String brand = scanner.next();

                System.out.println("Введите Модель");
                String model = scanner.next();

                System.out.println("Введите Цвет");
                String color = scanner.next();

                System.out.println("Введите Количество");
                int quantity = Integer.parseInt(scanner.next());

                System.out.println("Введите Цену");
                double price = Double.parseDouble(scanner.next());


                Car car = new Car(brand, model, color, quantity, price);
                carList.put(car.getId(),car);
            }



        @Override
        public void read(HashMap<Integer, Car> carList)
            {
                System.out.println("выбрали просмотр");
                carList.entrySet().stream().forEach(entry -> System.out.println(entry.getValue().toString()));
            }

        @Override
        public void update(Scanner scanner, HashMap<Integer, Car> carList)
            {
                System.out.println("изменения");
                System.out.println("Выберите, какое авто изменить по ID");
                int id = Integer.parseInt(scanner.next());
                Car currentCar = carList.get(id);
                System.out.println("Выберите, что менять: марка,модель,цвет,количество,цена");

                String ch = scanner.next();
                switch (ch)
                    {
                        case "марка":
                            System.out.println("Введите марку");
                            currentCar.setBrand(scanner.next());

                            break;
                        case "модель":

                            System.out.println("Введите модель");
                            currentCar.setModel(scanner.next());
                            break;

                        case "цвет":
                            System.out.println("Введите цвет");
                            currentCar.setColor(scanner.next());

                            break;

                        case "количество":
                            System.out.println("Введите колличество");
                            currentCar.setQuantity(Integer.parseInt(scanner.next()));

                            break;
                        case "цена":
                            System.out.println("Введите цену");
                            currentCar.setPrice(Double.parseDouble(scanner.next()));

                            break;

                    }

            }

        @Override
        public void delete(Scanner scanner, HashMap<Integer, Car> carList)
            {
                System.out.println("удаление");
                System.out.println("Выберите, какое авто удалить по ID");
                int id2 = Integer.parseInt(scanner.next());
                Car currentCar2 = carList.remove(id2);
            }
    }
