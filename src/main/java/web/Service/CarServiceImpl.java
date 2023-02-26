package web.Service;

import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    
    @Override
    public List<Car> carShow(int count) {
        return carDAO.carShow(count);
    }
}