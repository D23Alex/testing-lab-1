package com.d23alex;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;

public class Task1Test {
    private static final double eps = 0.01;
    private static final int many_terms = 100;

    private static final Map<Integer, Double> epsByTermAmount = Map.of(
            2, 0.5,
            4, 0.1,
            8, 0.05,
            16, 0.05,
            32, 0.01,
            64, 0.01,
            128, 0.005
    );

    @Test
    void forAnyTermAmount_ArctanOfZeroIsZero() {
        List.of(2, 20, 100, 1000, 5000, 10000, 100000, 10000000).forEach(
                terms -> assertEquals(0, Task1.arctan(0, terms), eps)
        );
    }

    @Test
    void whenValueOutOfConvergenceRangePassed_WillThrowIllegalArgumentException() {
        List.of(Task1.CONVERGENCE_RANGE_FROM - 0.1, Task1.CONVERGENCE_RANGE_FROM - 1, Task1.CONVERGENCE_RANGE_FROM - 10,
                Task1.CONVERGENCE_RANGE_TO + 0.1, Task1.CONVERGENCE_RANGE_TO + 1, Task1.CONVERGENCE_RANGE_TO + 10).forEach(
                        x -> assertThrowsExactly(IllegalArgumentException.class, () -> Task1.arctan(x, many_terms)));
    }

    @Test
    void forAnyValueInConvergenceRange_WillCalculateArctanWithRespectiveEps() {
        DoubleStream.iterate(-1, d -> d + 0.01).limit(200).forEach(
                x -> epsByTermAmount.keySet().forEach(
                        terms -> assertEquals(Math.atan(x), Task1.arctan(x, terms), epsByTermAmount.get(terms))
                )
        );
    }
}
