package deals.couponsmanager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriTemplateHandler;

public class CouponsManagerApplicationTest {
    @Test
    public void testRestTemplate() {
        RestTemplate actualRestTemplateResult = (new CouponsManagerApplication()).restTemplate();
        UriTemplateHandler uriTemplateHandler = actualRestTemplateResult.getUriTemplateHandler();
        assertTrue(uriTemplateHandler instanceof DefaultUriBuilderFactory);
        assertTrue(actualRestTemplateResult
                .getRequestFactory() instanceof org.springframework.http.client.SimpleClientHttpRequestFactory);
        assertTrue(actualRestTemplateResult
                .getErrorHandler() instanceof org.springframework.web.client.DefaultResponseErrorHandler);
        List<HttpMessageConverter<?>> messageConverters = actualRestTemplateResult.getMessageConverters();
        assertEquals(7, messageConverters.size());
        assertEquals(DefaultUriBuilderFactory.EncodingMode.URI_COMPONENT,
                ((DefaultUriBuilderFactory) uriTemplateHandler).getEncodingMode());
        assertFalse(((Jaxb2RootElementHttpMessageConverter) messageConverters.get(5)).isSupportDtd());
        assertFalse(((Jaxb2RootElementHttpMessageConverter) messageConverters.get(5)).isProcessExternalEntities());
        ObjectMapper objectMapper = ((MappingJackson2HttpMessageConverter) messageConverters.get(6)).getObjectMapper();
        assertTrue(objectMapper.getVisibilityChecker() instanceof VisibilityChecker.Std);
        assertTrue(
                objectMapper.getSubtypeResolver() instanceof com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver);
        assertTrue(objectMapper
                .getSerializerProviderInstance() instanceof com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl);
        assertTrue(objectMapper
                .getSerializerProvider() instanceof com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl);
        assertTrue(objectMapper.getSerializerFactory() instanceof com.fasterxml.jackson.databind.ser.BeanSerializerFactory);
        assertNull(objectMapper.getPropertyNamingStrategy());
        assertTrue(objectMapper
                .getDeserializationContext() instanceof com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl);
        assertTrue(objectMapper
                .getPolymorphicTypeValidator() instanceof com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator);
        assertTrue(objectMapper.getDateFormat() instanceof com.fasterxml.jackson.databind.util.StdDateFormat);
        assertSame(objectMapper.getJsonFactory(), objectMapper.getFactory());
        assertNull(objectMapper.getTypeFactory().getClassLoader());
    }
}

