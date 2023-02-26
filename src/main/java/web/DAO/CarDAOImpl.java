package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{
    private int countCar = 0;
    private final List <Car> tableCars = new ArrayList<>();

    {
    tableCars.add(new Car("BMW", 2010, "Q"));
    tableCars.add(new Car("Lada", 2015, "10"));
    tableCars.add(new Car("Mersedes", 2005, "S5"));
    tableCars.add(new Car("Lamba", 2019, "Sew1"));
    tableCars.add(new Car("Honda", 2011, "Civik"));

    Iterator countIterator = tableCars.iterator();
    while(countIterator.hasNext()) {
        countCar++;
    }
    }

    public List<Car> carShow(int count) {
        if (count == 0) {
            return tableCars;
        }
        return tableCars.stream().limit(count).toList();
    }

}
