package structural.adapter;

import structural.adapter.service.Service;
import structural.adapter.service.ServiceImpl;

public class ServiceAdapter implements ClientInterface {

    Service service = new ServiceImpl();

    @Override
    public Integer method(Character data) {
        Long result = service.serviceMethod(String.valueOf(data));
        return result.intValue();
    }
}
