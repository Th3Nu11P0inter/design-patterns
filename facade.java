class DataRepository {
    void dataOperation() { /*...*/ }
}
class SystemService {
    void serviceOperation() { /*...*/ }
}

class SystemFacade {
    private DataRepository repository;
    private SystemService service;

    SystemFacade(DataRepository repository, SystemService service) {
        this.repository = repository;
        this.service = service;
    }

    void performTask() {
        repository.dataOperation();
        service.serviceOperation();
    }
}
