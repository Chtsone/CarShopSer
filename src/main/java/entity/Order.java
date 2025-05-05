package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
public class Order
    {
        private int id;
        private String nameUser;
        private int idCar;
        private LocalDate orderDate;
        private String status;

        public Order(String nameUser, int idCar, LocalDate orderDate, String status)
            {
                this.nameUser = nameUser;
                this.idCar = idCar;
                this.orderDate = orderDate;
                this.status = status;
            }

        public Order(int id, String nameUser, int idCar, LocalDate orderDate, String status)
            {
                this.id = id;
                this.nameUser = nameUser;
                this.idCar = idCar;
                this.orderDate = orderDate;
                this.status = status;
            }
    }
