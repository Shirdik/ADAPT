package deals.couponsmanager.Service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@ContextConfiguration(classes = {CouponsService.class, RestTemplate.class})
@ExtendWith(SpringExtension.class)
public class CouponsServiceTest {
    @Autowired
    private CouponsService couponsService;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    public void testIsValidUser() throws RestClientException {
        when(this.restTemplate.getForObject(anyString(), (Class<Object>) any(), (Object[]) any())).thenReturn("42");
        assertTrue(this.couponsService.isValidUser("janedoe"));
        verify(this.restTemplate).getForObject(anyString(), (Class<Object>) any(), (Object[]) any());
    }

    @Test
    public void testIsValidUser2() throws RestClientException {
        when(this.restTemplate.getForObject(anyString(), (Class<Object>) any(), (Object[]) any())).thenReturn(null);
        assertFalse(this.couponsService.isValidUser("janedoe"));
        verify(this.restTemplate).getForObject(anyString(), (Class<Object>) any(), (Object[]) any());
    }

    @Test
    public void testRewardsReducer() throws RestClientException {
        doNothing().when(this.restTemplate).put(anyString(), (Object) any(), (Object[]) any());
        this.couponsService.rewardsReducer("janedoe", 10.0);
        verify(this.restTemplate).put(anyString(), (Object) any(), (Object[]) any());
    }
}

