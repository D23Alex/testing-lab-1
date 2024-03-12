package com.d23alex.task3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Planet {
    private String name;
    private Coordinates centerCoordinates;
}
