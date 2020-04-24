import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.core.Response;

/**
 * @author Petr Kremensky pkremens@redhat.com
 */
public class Demo {
    public static void main(String[] args) {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("http://localhost:8080/helloworld-rs/rest/json");
        Response response = target.request().get();
        String out = response.readEntity(String.class);
        System.out.println(out);
        response.close();
    }
}
