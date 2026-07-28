package com.example.mockito;

public class UserService {

    private ExternalApi api;

    public UserService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

}