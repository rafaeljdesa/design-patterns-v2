package structural.adapter.service;

public class ServiceImpl implements Service {

    @Override
    public Long serviceMethod(String string) {
        System.out.println("Service executed!");
        return 1L;
    }
}
