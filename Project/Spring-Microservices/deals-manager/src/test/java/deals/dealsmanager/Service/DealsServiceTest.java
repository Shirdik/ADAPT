package deals.dealsmanager.Service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import deals.dealsmanager.Models.UserModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@ContextConfiguration(classes = {RestTemplate.class, DealsService.class})
@ExtendWith(SpringExtension.class)
public class DealsServiceTest {
    @Autowired
    private DealsService dealsService;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    public void testIsValidUser() throws RestClientException {
        when(this.restTemplate.getForObject(anyString(), (Class<Object>) any(), (Object[]) any()))
                .thenReturn(new UserModel());
        assertTrue(this.dealsService.isValidUser("janedoe"));
        verify(this.restTemplate).getForObject(anyString(), (Class<Object>) any(), (Object[]) any());
    }

    @Test
    public void testIsValidUser2() throws RestClientException {
        when(this.restTemplate.getForObject(anyString(), (Class<Object>) any(), (Object[]) any())).thenReturn(null);
        assertFalse(this.dealsService.isValidUser("janedoe"));
        verify(this.restTemplate).getForObject(anyString(), (Class<Object>) any(), (Object[]) any());
    }

    @Test
    public void testRewardsAdder() throws RestClientException {
        doNothing().when(this.restTemplate).put(anyString(), (Object) any(), (Object[]) any());
        this.dealsService.rewardsAdder("janedoe", 10.0);
        verify(this.restTemplate).put(anyString(), (Object) any(), (Object[]) any());
    }
}

