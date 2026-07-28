package com.example.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi api = mock(ExternalApi.class);

        UserService service = new UserService(api);

        service.fetchData();

        verify(api).getData();

    }
}