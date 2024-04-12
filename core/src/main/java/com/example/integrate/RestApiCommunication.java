
package com.example.integrate;

import com.example.exception.SystemException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Slf4j
@Component
public class RestApiCommunication<T> {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<T> exchangeJsonUrl(HttpMethod method,
                                            HttpHeaders headers,
                                            String url,
                                            String params,
                                            Class<T> responseType) throws SystemException {
        ResponseEntity<T> response = null;
//        headers.add("apikey", apiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);
        try {
            URI uri = new URI(url);
            HttpEntity<String> entity = new HttpEntity(params, headers);
//            log.info("Api key {}", apiKey);
            log.info("Header {}", headers);
            log.info("Body {}", params);
            log.info("Uri {}", uri);

            response = restTemplate.exchange(uri, method, entity, responseType);

            log.info("Response {}", response);
            return response;
        } catch (Exception e) {
            log.error("Call api to gateway kong failed {} {}", e.getClass(), e.getMessage());
            throw new SystemException("Call to " + url + " failed!!");
        }
    }
}
