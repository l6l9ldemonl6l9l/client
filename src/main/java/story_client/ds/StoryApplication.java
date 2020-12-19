package story_client.ds;

import story_client.ds.client.GrpcTest;
import story_client.ds.client.RabbitTest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import story_client.ds.client.RabbitTest;

@SpringBootApplication
public class StoryApplication {

    private final static String url = "localhost";
    private static final ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 7080).usePlaintext().build();

    public static void main(String[] args) {
        GrpcTest grpcTest = new GrpcTest();
        grpcTest.test();
        //RabbitTest rabbitTest = new RabbitTest();
        //rabbitTest.testClient();

    }
}
