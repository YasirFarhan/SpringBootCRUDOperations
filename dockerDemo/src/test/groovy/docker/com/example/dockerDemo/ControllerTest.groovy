package docker.com.example.dockerDemo

import docker.com.example.dockerDemo.controller.UserController
import docker.com.example.dockerDemo.factory.UsersDAO
import docker.com.example.dockerDemo.model.UserModel
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification
import spock.lang.Subject




class ControllerTest extends Specification {


    @Subject
    UserController controller;


    @Autowired
    private MockMvc mvc

    UsersDAO usersDAO = Mock()
    UserModel userModel = Mock()

    def setup() {

        controller = new UserController(
                usersDAO: usersDAO
        );


    }

    def "should get the user model given the id"() {
        given:
        Long id = 5;
        usersDAO.findRecordById(id) >> userModel

        when:
        UserModel myUserModel = controller.findById(id)

        then:
        myUserModel  != null
        myUserModel == userModel

    }
}


