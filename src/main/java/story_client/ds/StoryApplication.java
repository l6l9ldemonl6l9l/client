package story_client.ds;

import story_client.ds.client.GrpcTest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StoryApplication {

    private final static String url = "localhost";
    private static final ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 7081).usePlaintext().build();

    public static void main(String[] args) {
        GrpcTest grpcTest = new GrpcTest();
        grpcTest.test();
    }
}
