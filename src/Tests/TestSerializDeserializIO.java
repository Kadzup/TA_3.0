package Tests;

import IO.serializDeserialiIO;
import Models.*;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class TestSerializDeserializIO {
    @Test
    void SerializeJson(){
        serializDeserialiIO jPars = new serializDeserialiIO();
        String path = "c://";
        Worker worker = new Worker.Builder()
                .setAddress("some street")
                .setBDay(LocalDate.of(2019,10, 10))
                .setFName("Alex")
                .setLName("Lusek")
                .setPhone("+000 000 0000 00")
                .setPosition("software engineer")
                .setSalary(1500)
                .build();

        String expected = jPars.SserializeJson(worker, path);

        Assertions.assertEquals(true, expected.contains("\"firstName\":\"Alex\""));
    }
}
