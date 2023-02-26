package web.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO{

    private final List <Car> tableCars = new ArrayList<>();

    {
    tableCars.add(new Car("BMW", 2010, "Q"));
    tableCars.add(new Car("Lada", 2015, "10"));
    tableCars.add(new Car("Mersedes", 2005, "S5"));
    tableCars.add(new Car("Lamba", 2019, "Sew1"));
    tableCars.add(new Car("Honda", 2011, "Civik"));
    }

    public List<Car> carShow(int count) {
        if (count == 0) {
            return tableCars;
        }
        return tableCars.stream().limit(count).collect(Collectors.toList());
    }


}
