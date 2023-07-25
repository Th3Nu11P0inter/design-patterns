interface Service {
    void execute();
}

class Client {
    private Service service;

    Client(Service service) {
        this.service = service;  // Injecting dependency through constructor
    }

    void doSomething() {
        service.execute();
    }
}
