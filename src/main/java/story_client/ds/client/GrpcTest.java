package story_client.ds.client;

import distributedsystems.Deity.DeityRequest;
import distributedsystems.Deity.DeityServiceGrpc;
import distributedsystems.Food.FoodRequest;
import distributedsystems.Food.FoodServiceGrpc;
import distributedsystems.Terrain.TerrainRequest;
import distributedsystems.Terrain.TerrainServiceGrpc;
import distributedsystems.FairyAnimal.FairyAnimalRequest;
import distributedsystems.FairyAnimal.FairyAnimalServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcTest {
    private final String url = "127.0.0.1";
    private final ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 57802).usePlaintext().build();
    DeityServiceGrpc.DeityServiceBlockingStub DeityStub = DeityServiceGrpc.newBlockingStub(channel);
    TerrainServiceGrpc.TerrainServiceBlockingStub TerrainStub = TerrainServiceGrpc.newBlockingStub(channel);
    FoodServiceGrpc.FoodServiceBlockingStub FoodStub = FoodServiceGrpc.newBlockingStub(channel);
    FairyAnimalServiceGrpc.FairyAnimalServiceBlockingStub FairyAnimalStub = FairyAnimalServiceGrpc.newBlockingStub(channel);

    public void test() {

        addFood("Small Food", 5);
        addFood("Medium Food", 6);
        addFood("Big Food", 10);

        addDeity("Small Deity", 5);
        addDeity("Medium Deity", 6);
        addDeity("Big Deity", 10);

        addTerrain("terrain1", 300);
        addTerrain("terrain2", 200);
        addTerrain("terrain3", 400);

        addFairyAnimal("fox", 10, 10);
        addFairyAnimal("crow", 20, 20);
        addFairyAnimal("cat", 30, 30);

    }

    private void addFood(String name, int taste) {
        //System.out.println("Hello world!");
        FoodRequest food = FoodRequest.newBuilder().
                setName(name).
                setTaste(taste).
                build();
        FoodStub.add(food);
        System.out.println("Hello Food!");

    }
    private void addDeity(String name, int age) {
        DeityRequest deity = DeityRequest.newBuilder().
                setName(name).
                setAge(age).
                build();
        DeityStub.add(deity);
        System.out.println("Hello Deity!");
    }
    private void addTerrain(String name, int sizeBeauty) {
        TerrainRequest Terrain = TerrainRequest.newBuilder().
                setName(name).
                setSizeBeauty(sizeBeauty).
                build();
        TerrainStub.add(Terrain);
        System.out.println("Hello Terrain!");
    }
    private void addFairyAnimal(String name, int energy, int sizeMind ) {
        FairyAnimalRequest FairyAnimal = FairyAnimalRequest.newBuilder().
                setName(name).
                setEnergy(energy).
                setSizeMind(sizeMind).
                build();
        FairyAnimalStub.add(FairyAnimal);
        System.out.println("Hello FairyAnimal!");

    }

}
