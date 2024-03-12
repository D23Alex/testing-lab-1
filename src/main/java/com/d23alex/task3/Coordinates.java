package com.d23alex.task3;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coordinates {
    private double x;
    private double y;
    private double z;
}
