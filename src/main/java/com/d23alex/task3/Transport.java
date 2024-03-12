package com.d23alex.task3;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Transport {
    private Coordinates position;
    private List<Travel> travelHistory;
    private int speedLimitInMetersPerSec;

    public void goTo(Coordinates coordinates, String moveDescription) {

    }

    public void moveBy(Coordinates coordinates, String moveDescription) {

    }


}
