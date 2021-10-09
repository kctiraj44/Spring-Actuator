package com.actuator.SpringActuator.endpoints;

import lombok.*;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id ="tiraj",enableByDefault = true)
public class Myendpoints {

    @ReadOperation
    public  MyEndpointsResponse features(){
        return new MyEndpointsResponse(2656776,"Java-Techie","Active");
    }
}


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
class MyEndpointsResponse{
    private int id;
    private String name;
    private String status;

}