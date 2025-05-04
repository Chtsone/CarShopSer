package entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car
    {
        private String brand;
        private String model;
        private String color;
        private int id;

        private int quantity;


        private double price;

        public Car(String brand, String model, String color, int quantity, double price)
            {
                this.brand = brand;
                this.model = model;
                this.color = color;
                this.quantity = quantity;
                this.price = price;
            }

        public Car(int id, String brand, String model, String color, int quantity, double price)
            {
                this.brand = brand;
                this.model = model;
                this.color = color;
                this.quantity = quantity;
                this.price = price;
                this.id = id;
            }


        @Override
        public String toString()
            {
                return "entity.Car{" +
                        "id=" + id +
                        ", brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", color='" + color + '\'' +
                        ", quantity=" + quantity +
                        ", price=" + price +
                        '}';
            }
    }
