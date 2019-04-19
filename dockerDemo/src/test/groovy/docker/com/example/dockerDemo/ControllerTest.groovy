package docker.com.example.dockerDemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

@AutoConfigureMockMvc
@WebMvcTest
class ControllerTest extends Specification {


    @Autowired
    private MockMvc mvc


    def "when get method end point is called'"() {
        expect:
        "Status is 200 and the response is 'Hello world!'"
        mvc.perform(get("/find/1").contentType(APPLICATION_JSON))
        System.setProperty("use.database", "cql")
//        cassandraRepository.findAll();
    }
}


