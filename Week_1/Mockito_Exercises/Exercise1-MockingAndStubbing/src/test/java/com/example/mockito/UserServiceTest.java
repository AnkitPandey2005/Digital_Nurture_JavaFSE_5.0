package com.example.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void testFetchData() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mockito Working");

        UserService service = new UserService(api);

        String result = service.fetchData();

        assertEquals("Mockito Working", result);
    }

}