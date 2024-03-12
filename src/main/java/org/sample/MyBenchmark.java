package org.sample;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.HashSet;
import java.util.Random;

public class MyBenchmark {

    @Benchmark
    public void testPointHashMap() {
        final Random random = new Random();
        HashSet<Point> pointSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            Point point = new Point(random.nextInt(1000), random.nextInt(1000));
            pointSet.add(point);
        }
    }
    @Benchmark
    public void testPointHashMapFixedSize() {
        final Random random = new Random();
        HashSet<Point> pointSet = HashSet.newHashSet(10000);
        for (int i = 0; i < 10000; i++) {
            Point point = new Point(random.nextInt(1000), random.nextInt(1000));
            pointSet.add(point);
        }
    }
    @Benchmark
    public void testWrongPointHashMap() {
        final Random random = new Random();
        HashSet<WrongPoint> pointSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            WrongPoint point = new WrongPoint(random.nextInt(1000), random.nextInt(1000));
            pointSet.add(point);
        }
    }
    @Benchmark
    public void testWrongPointHashMapFixedSize() {
        final Random random = new Random();
        HashSet<WrongPoint> pointSet = HashSet.newHashSet(10000);
        for (int i = 0; i < 10000; i++) {
            WrongPoint point = new WrongPoint(random.nextInt(1000), random.nextInt(1000));
            pointSet.add(point);
        }
    }

    @Benchmark
    public void midByDiv() {
        int l = 0;
        int r = 1000000000;
        int midpoint = (l + r) / 2;
    }

    @Benchmark
    public void midByBitshift() {
        int l = 0;
        int r = 1000000000;
        int midpoint = (l + r) >> 1;
    }
}
